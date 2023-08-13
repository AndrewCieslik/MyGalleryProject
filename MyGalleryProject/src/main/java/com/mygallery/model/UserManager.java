package com.mygallery.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserManager {
    private Connection conn;

    public UserManager(Connection conn) {
        this.conn = conn;
    }

    public void addUser(int id, String name, String password, String role) {
        if (!role.equalsIgnoreCase("admin") && !role.equalsIgnoreCase("client")) {
            System.out.println("Invalid role. Allowed roles: admin, client.");
            return;
        }
        String insertSql = "INSERT INTO users (user_id, user_name, user_password, user_role) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(insertSql);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, password);
            pstmt.setString(4, role);
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
