package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    static Connection conn = null;

    public static Connection getConnection() throws SQLException {

        if (conn == null) {

            String url = "jdbc:mysql://localhost:3306/shcs";
            String username = "root";
            String pass = "123456";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, username, pass);
                System.out.println("Connection Successfully");

            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

        }
        return conn;

    }

   

}
