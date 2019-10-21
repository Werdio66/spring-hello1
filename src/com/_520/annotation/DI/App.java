package com._520.annotation.DI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

    @Autowired
    private Dog dog;
    @Autowired
    private Person person;

    @Test
    void test() {//
        System.out.println(dog);
        System.out.println(person);
    }
}
