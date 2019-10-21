package com._520.register.DAO;

import com._520.register.DAO.domain.User;

import java.sql.SQLException;

public interface IUserDAO {
    void save(User user) throws SQLException;
}
