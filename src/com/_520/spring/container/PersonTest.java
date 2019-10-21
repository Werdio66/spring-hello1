package com._520.spring.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PersonTest {
    /**
     * 使用beanFactory创建Spring Ioc容器
     * -----------------------------------------------------------
     * 构造器。。。。。。。。。。。。。。。。
     * com._520.spring.container.Person@46fa7c39
     * 延迟初始化（lazy），在构建Ioc容器时不会立马创建对象，而是等到从容器中获取对象时才去创建对象
     */
    @Test
    void testBeanFactory(){
        Resource resource = new ClassPathResource("applicationConfig.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        System.out.println("-----------------------------------------------------------");
        //从容器中获取bean
        Person bean = beanFactory.getBean("person",Person.class);
        System.out.println(bean);
    }

    /**
     * 使用ApplicationContext创建Spring Ioc容器
     *
     *构造器。。。。。。。。。。。。。。。。
     * -----------------------------------------------------------
     * com._520.spring.container.Person@4c163e3
     * 在创建容器时，会马上把容器管理的所有bean初始化
     */
    @Test
    void testApplicationContext(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationConfig.xml");
        System.out.println("-----------------------------------------------------------");
        //从容器中获取bean
        Person bean = ctx.getBean("person",Person.class);
        System.out.println(bean);
    }
}
