package com._520.proxy_cglib.dao;

import com._520.proxy_cglib.dao.domain.Employee;

public interface IEmployeeDAO {
    void save(Employee employee);
    void delete(Employee employee);
}
