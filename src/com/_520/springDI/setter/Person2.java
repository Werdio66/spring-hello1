package com._520.springDI.setter;

public class Person2 {
    private Person1 p1;

    public void setP1(Person1 p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "p1=" + p1 +
                '}';
    }
}
