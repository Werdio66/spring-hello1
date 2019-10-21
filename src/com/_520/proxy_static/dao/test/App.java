package com._520.proxy_static.dao.test;

import com._520.proxy_static.dao.domain.Employee;
import com._520.proxy_static.dao.proxy.EmployeeServiceProxy;
import com._520.proxy_static.dao.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private IEmployeeService service;
    @Test
   void test() {
        System.out.println(service.getClass());
      service.save(new Employee());
      System.out.println("----------------------------------");
      service.delete(new Employee());
    }
}
