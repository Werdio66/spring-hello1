package com._520.register.DAO.test;

import com._520.register.DAO.IUserDAO;
import com._520.register.DAO.action.UserAction;
import com.alibaba.druid.pool.DruidDataSource;
import lombok.Setter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringJUnitConfig
public class App {
    @Autowired
    private UserAction userAction;
    @Test
    void test() throws SQLException {
        userAction.exxcute();
    }
}
