package com.mygallery.controller;

import java.sql.*;


public class MySQLConnector {
    private String url;
    private String user;
    private String password;
    private Connection conn;
    private Statement stmt;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

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
