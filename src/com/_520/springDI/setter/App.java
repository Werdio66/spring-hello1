package com._520.springDI.setter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

    @Autowired
    private Person1 person1;
    @Autowired
    private Person2 person2;
    @Autowired
    private Person3 person3;

    @Test
    void test1(){
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
