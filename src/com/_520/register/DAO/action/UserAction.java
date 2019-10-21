package com._520.register.DAO.action;
import com._520.register.DAO.domain.User;
import com._520.register.DAO.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.sql.SQLException;

//模拟struct2的action或者是springMVC的controller
@Controller
public class UserAction {
    @Autowired
    private IUserService service;

    public String exxcute() throws SQLException {
        System.out.println("注册请求");
        service.register(new User());
        return "success";
    }
}
