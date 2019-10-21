package com._520.spring.hello;

import com._520.spring.hello.HelloWord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

public class HelloWordTest {

    @Test
    public void hello(){
        HelloWord helloWord = null;
        //加载spring配置文件
        Resource resource = new ClassPathResource("com/_520/spring/hello/hello.xml");
        //创建spring的容器对象
        BeanFactory factory = new XmlBeanFactory(resource);
        //从spring容器中获取指定名为helloWord的bean
        //helloWord = (HelloWord) factory.getBean("helloWord");
        //通过类型获取bean，
        //helloWord = factory.getBean(HelloWord.class);
        //通过名称和类型获取bean
        helloWord = factory.getBean("helloWord",HelloWord.class);
        helloWord.sayHello();
    }

    //模拟spring-ioc
    @Test
    void test() throws Exception {
        HelloWord helloWord = null;
        String className = "com._520.spring.hello.HelloWord";
        // -------------------模拟spring-ioc----------------------------
        //使用反射创建对象
        //获取类的字节码
        Class clzz = Class.forName(className);
        //得到构造器
        Constructor constructor = clzz.getDeclaredConstructor();
        //设置可见
        constructor.setAccessible(true);
        //通过构造器创建对象
        Object obj = constructor.newInstance();
        
        //使用内省机制设置属性
        BeanInfo beanInfo = Introspector.getBeanInfo(clzz,Object.class);
        //获取所有的属性值
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor ps:propertyDescriptors
             ) {
            String propertyName = ps.getName();
            if ("name".equals(propertyName)){
                ps.getWriteMethod().invoke(obj,"niu niu");
            }else if ("age".equals(propertyName)){
                //
                ps.getWriteMethod().invoke(obj,22);
            }
        }
        helloWord = (HelloWord) obj;
        //---------------------------------------------------------------
        helloWord.sayHello();

    }
}
