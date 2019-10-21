package com._520.proxy_jdk.dao.tx;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//事务管理增强
public class TransactionMangerAdvice implements InvocationHandler {

    private Object target;  // 真实对象
    private TransactionManger txManger;     // 事务管理器

    public void setTxManger(TransactionManger txManger) {
        this.txManger = txManger;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public <T>T getProxyObject(){

        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//类加载器
                target.getClass().getInterfaces(),//真实对象实现的接口
                this//如何做事务增强
        );
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //事务增强
        txManger.begin();
        try{
            method.invoke(target,args);
            txManger.commit();      //正常执行时提交事务
        }catch (Exception e){
            e.printStackTrace();
            txManger.rollback();    // 回滚
        }
        return null;
    }
}
