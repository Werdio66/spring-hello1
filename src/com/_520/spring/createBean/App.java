package com._520.spring.createBean;

import com._520.spring.createBean.constructor.Cat1;
import com._520.spring.createBean.factoryBean.Cat4;
import com._520.spring.createBean.instanceMethod.Cat3;
import com._520.spring.createBean.lifecycle.Dog1;
import com._520.spring.createBean.staticMethod.Cat2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private Cat1 cat1;
    @Autowired
    private Cat1 cat11;
    @Autowired
    private Cat2 cat2;
    @Autowired
    private Cat3 cat3;
    @Autowired
    private Cat4 cat4;

    @Test
    void test1(){
        System.out.println(cat1);
        System.out.println(cat11);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
    }


    @Autowired
    private Dog1 dog1;
    //liftcycle
    @Test
    void test2(){
        dog1.dowork();
    }

    //手动创建Ioc
    @Test
    void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/_520/spring/createBean/App-context.xml");
        dog1 = ctx.getBean("dog1", Dog1.class);

    }
}
