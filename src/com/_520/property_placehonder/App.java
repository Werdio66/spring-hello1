package com._520.property_placehonder;

import com.alibaba.druid.pool.DruidDataSource;
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
    private DruidDataSource dataSource;
    @Test
   void test() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT *FROM employee");
        ResultSet resultSet = preparedStatement.executeQuery();
       while (resultSet.next()){
           System.out.print(resultSet.getInt("id") + ",");
           System.out.print(resultSet.getString("name") + ",");
           System.out.println(resultSet.getInt("dept_id"));
       }
        preparedStatement.close();
        connection.close();
    }
}
