package com._520.proxy_static.dao.proxy;

import com._520.proxy_static.dao.domain.Employee;
import com._520.proxy_static.dao.service.IEmployeeService;
import com._520.proxy_static.dao.tx.TransactionManger;
import org.springframework.beans.factory.annotation.Autowired;

//静态代理模式
public class EmployeeServiceProxy implements IEmployeeService {

    //真实对象
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private TransactionManger txManger;

    public void setEmployeeService(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setTxManger(TransactionManger txManger) {
        this.txManger = txManger;
    }

    public void save(Employee employee) {
        //
        txManger.begin();
        try{
            employeeService.save(employee);
            txManger.commit();
        }catch (Exception e){
            txManger.rollback();
        }

    }

    public void delete(Employee employee) {
        txManger.begin();
        try {
           employeeService.delete(employee);
           txManger.commit();
        } catch (Exception e) {
            txManger.rollback();
        }
    }
}
