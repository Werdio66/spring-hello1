package com._520.proxy_static.dao.service.impl;

import com._520.proxy_static.dao.IEmployeeDAO;
import com._520.proxy_static.dao.domain.Employee;
import com._520.proxy_static.dao.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

//业务层
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
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
