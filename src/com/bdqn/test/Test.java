package com.bdqn.test;

import java.sql.*;

/**
 * Created by Administrator on 2018/9/28.
 */
public class Test {


    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/epet","root","111111");
            if(conn!=null){
                System.out.println("数据库连接成功");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
