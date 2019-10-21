package com._520.spring.createBean.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class Cat4Factory implements FactoryBean<Cat4> {
    //实例工厂
    public Cat4 getObject() throws Exception {
        Cat4 cat4 = new Cat4();
        //TODO做一些其他操作
        return cat4;
    }

    public Class<?> getObjectType() {
        return Cat4.class;
    }
}
