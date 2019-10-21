package com._520.proxy_cglib.dao.tx;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

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

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());      // 设置为哪个父类做增强
        enhancer.setCallback(this);                     // 设置增强的对象
        return (T) enhancer.create();                   //创建代理对象
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
