package com._520.spring.createBean.staticMethod;

import com._520.spring.createBean.constructor.Cat1;

public class Cat2Factory {

    private Cat2Factory(){}
    public static Cat2 getInstence(){
        return new Cat2();
    }
}
