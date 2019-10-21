package com._520.proxy_jdk.dao.test;

import com._520.proxy_jdk.dao.domain.Employee;
import com._520.proxy_jdk.dao.service.IEmployeeService;
import com._520.proxy_jdk.dao.tx.TransactionMangerAdvice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    //创建事务增强对象
    @Autowired
    private TransactionMangerAdvice advice;
    @Test
   void testSave() {
        //得到EmployeeService的代理对象
        IEmployeeService proxy = advice.getProxyObject();
//        System.out.println(proxy.getClass());
        proxy.save(new Employee());
    }
    @Test
   void testDdelete() {
        //得到EmployeeService的代理对象
        IEmployeeService proxy = advice.getProxyObject();
//        System.out.println(proxy.getClass());
        proxy.delete(new Employee());
    }
}
