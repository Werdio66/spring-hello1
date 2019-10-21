package com._520.spring.spring_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//运行Spring的Junit4
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:com/_520/spring/spring_test/SomeBeanTestJunit4-context.xml")
@ContextConfiguration
public class SomeBeanTestJunit4 {
    @Autowired
    private SomeBean bean;
    @Test
    public void test1(){
        bean.dowork();
    }
}
