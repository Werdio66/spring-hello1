package com._520.register.DAO.service.impl;

import com._520.register.DAO.IUserDAO;
import com._520.register.DAO.domain.User;
import com._520.register.DAO.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.SQLException;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO dao;


    public void register(User user) throws SQLException {
        System.out.println("注册操作");
        dao.save(user);
    }
}
