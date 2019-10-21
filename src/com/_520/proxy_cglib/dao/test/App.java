package com._520.proxy_cglib.dao.test;

import com._520.proxy_cglib.dao.domain.Employee;
import com._520.proxy_cglib.dao.service.impl.EmployeeServiceImpl;
import com._520.proxy_cglib.dao.tx.TransactionMangerAdvice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private TransactionMangerAdvice advice;
    @Test
   void testSave() {
        EmployeeServiceImpl proxy = advice.getProxyObject();
        System.out.println(proxy.getClass());
        proxy.save(new Employee());
    }
    @Test
   void testDdelete() {
        EmployeeServiceImpl proxy = advice.getProxyObject();
        proxy.delete(new Employee());
    }
}
