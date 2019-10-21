package com._520.annotation.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean1")
@Scope("prototype")
public class SomeBean {

     SomeBean(){
        System.out.println("构建对象");
    }

    void open(){
        System.out.println("初始化");
    }

    void close(){
        System.out.println("销毁");
    }

    void dowork(){
        System.out.println("TODO");
    }
}
