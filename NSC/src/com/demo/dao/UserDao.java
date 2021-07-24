package com.demo.dao;


import com.demo.model.User;
import com.demo.utils.ConnectionUtils;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    Connection connection = ConnectionUtils.getConnection();

    public boolean Login(String username, String password) {
        boolean st = false;

        String sql = ("SELECT * FROM user where username = '"
                + username + "' and password = '" + password + "'");

//        String sql = "SELECT * from user WHERE username=? and password=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1,username);
//            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            st = rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return st;
    }
}
