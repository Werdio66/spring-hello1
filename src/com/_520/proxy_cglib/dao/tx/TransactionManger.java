package com._520.proxy_cglib.dao.tx;

public class TransactionManger {
    public void begin(){
        System.out.println("开始事务");
    }

    public void commit(){
        System.out.println("提交事务");
    }

    public void rollback(){
        System.out.println("回滚事务");
    }
}
