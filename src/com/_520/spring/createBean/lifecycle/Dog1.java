package com._520.spring.createBean.lifecycle;

public class Dog1 {
    public Dog1(){
        System.out.println("创建对象");
    }

    public void init(){
        System.out.println("初始化-");
    }

    public void dowork(){
        System.out.println("工作");
    }
    public void distory(){
        System.out.println("销毁");
    }
}
