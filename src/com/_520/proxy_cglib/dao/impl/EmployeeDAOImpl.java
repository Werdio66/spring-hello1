package com._520.proxy_cglib.dao.impl;

import com._520.proxy_cglib.dao.IEmployeeDAO;
import com._520.proxy_cglib.dao.domain.Employee;

//持久层
public class EmployeeDAOImpl implements IEmployeeDAO {


    public void save(Employee employee) {
        System.out.println("保存员工！");
    }

    public void delete(Employee employee) {
        System.out.println("删除员工！");
    }
}
