package com._520.proxy_jdk.dao;

import com._520.proxy_jdk.dao.domain.Employee;

public interface IEmployeeDAO {
    void save(Employee employee);
    void delete(Employee employee);
}
