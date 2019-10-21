package com._520.annotation.lifecycle;

import com._520.annotation.Ioc.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private SomeBean bean1;
    @Autowired
    private SomeBean bean2;
    @Test
    void test() {//
        System.out.println(bean1);
        System.out.println(bean2);
        bean1.dowork();
    }
}
