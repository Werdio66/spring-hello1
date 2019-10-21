package com._520.annotation.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;

public class Dog {

    //找不到返回null
    @Autowired(required = false)
    //按指定名称找
    @Qualifier("cat1")
    private Cat cat;

    @Override
    public String toString() {
        return "Dog{" +
                "cat=" + cat +
                '}';
    }
}
