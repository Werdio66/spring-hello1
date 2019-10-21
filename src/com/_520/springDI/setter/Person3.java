package com._520.springDI.setter;

import java.util.*;

public class Person3 {
    private Set<String> set;
    private List<String> list;
    private int[] arr;
    private Map<String,Object> map;
    private Properties properties;

    @Override
    public String toString() {
        return "Person3{" +
                "set=" + set +
                ", list=" + list +
                ", arr=" + Arrays.toString(arr) +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
