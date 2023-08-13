package com.mygallery.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserManager {
    private Connection conn;

    public UserManager(Connection conn) {
        this.conn = conn;
    }

    public void addUser(String username, String password) {
        String insertSql = "INSERT INTO users (username, password) VALUES (?, ?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(insertSql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.executeUpdate();
            pstmt.close();
            System.out.println("User added.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeUser(String username) {
        String deleteSql = "DELETE FROM users WHERE username = ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setString(1, username);
            pstmt.executeUpdate();
            pstmt.close();
            System.out.println("User removed.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
