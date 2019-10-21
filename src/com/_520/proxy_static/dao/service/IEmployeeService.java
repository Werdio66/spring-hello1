package com._520.proxy_static.dao.service;

import com._520.proxy_static.dao.domain.Employee;

//业务层
public interface IEmployeeService {
    void save(Employee employee);
    void delete(Employee employee);
}
