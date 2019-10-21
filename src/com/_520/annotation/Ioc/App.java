package com._520.annotation.Ioc;

import com._520.annotation.DI.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

    @Autowired
    @Qualifier("xx")
   private Person person;

    @Test
    void test() {//
        System.out.println(person);
    }
}
