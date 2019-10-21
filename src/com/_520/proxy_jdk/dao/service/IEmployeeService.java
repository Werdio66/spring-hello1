package com._520.proxy_jdk.dao.service;

import com._520.proxy_jdk.dao.domain.Employee;

//业务层
public interface IEmployeeService {
    void save(Employee employee);
    void delete(Employee employee);
}
