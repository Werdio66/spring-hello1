package com._520.register.DAO.service;

import com._520.register.DAO.domain.User;

import java.sql.SQLException;

public interface IUserService {

    void register(User user) throws SQLException;
}
