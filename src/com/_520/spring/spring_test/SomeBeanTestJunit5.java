package com._520.spring.spring_test;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class SomeBeanTestJunit5 {
    @Autowired
    private SomeBean bean;
    @Test
    void test1(){//
        bean.dowork();
    }
}
