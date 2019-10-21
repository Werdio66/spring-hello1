package com._520.register.DAO.impl;

import com._520.register.DAO.IUserDAO;
import com._520.register.DAO.domain.User;
import com.alibaba.druid.pool.DruidDataSource;
import lombok.Cleanup;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UserDAOImpl implements IUserDAO {

    @Autowired
    private DruidDataSource dataSource;

    public void save(User user) throws SQLException {
        user.setName("rrrrr");
        System.out.println("保存");
        //获取连接对象
        @Cleanup
        Connection conn = dataSource.getConnection();
        //执行sql语句
        @Cleanup
        PreparedStatement ps = conn.prepareStatement("INSERT INTO user (name,age) VALUES (?,?)");
        ps.setString(1,user.getName());
        ps.setInt(2,user.getAge());
        ps.executeUpdate();
    }
}
