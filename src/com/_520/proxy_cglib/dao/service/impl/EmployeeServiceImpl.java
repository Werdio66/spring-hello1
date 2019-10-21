package com._520.proxy_cglib.dao.service.impl;

import com._520.proxy_cglib.dao.IEmployeeDAO;
import com._520.proxy_cglib.dao.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;

//业务层
public class EmployeeServiceImpl {


    private IEmployeeDAO dao;

    public void setDao(IEmployeeDAO dao) {
        this.dao = dao;
    }

    public void save(Employee employee) { //
            dao.save(employee);
        System.out.println("保存成功！");
    }

    public void delete(Employee employee) { //
        dao.delete(employee);
        System.out.println("删除失败！");
        throw new RuntimeException("啦啦啦");
    }
}
