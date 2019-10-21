package com._520.proxy_static.dao;

import com._520.proxy_static.dao.domain.Employee;

public interface IEmployeeDAO {
    void save(Employee employee);
    void delete(Employee employee);
}
