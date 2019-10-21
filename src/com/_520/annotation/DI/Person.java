package com._520.annotation.DI;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("${server.age}")
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
