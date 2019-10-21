package com._520.spring.hello;

public class HelloWord {
    private String name;
    private int age;

    private HelloWord(){}
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Hello word :" + this.name);
    }
}
