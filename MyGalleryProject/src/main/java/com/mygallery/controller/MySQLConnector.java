package com.mygallery.controller;

import lombok.Getter;
import lombok.Setter;
import java.sql.*;

@Getter
@Setter

public class MySQLConnector {
    private String url;
    private String user;
    private String password;
    private Connection conn;
    private Statement stmt;

    public MySQLConnector(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void connectToMySQL() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            System.out.println("MySQL connected.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnectMySQL() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
                System.out.println("MySQL disconnected.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
