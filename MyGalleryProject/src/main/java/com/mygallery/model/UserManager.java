//package com.mygallery.model;
//
//import com.mygallery.controller.MySQLConnector;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class UserManager {
//    private MySQLConnector dbConnector;
//
//    public UserManager(MySQLConnector dbConnector) {
//        this.dbConnector = dbConnector;
//    }
//
//    public void addUser(String username, String password) {
//        try {
//            Connection conn = dbConnector.getConnection();
//            String insertSql = "INSERT INTO users (username, password) VALUES (?, ?)";
//            PreparedStatement pstmt = conn.prepareStatement(insertSql);
//            pstmt.setString(1, username);
//            pstmt.setString(2, password);
//            pstmt.executeUpdate();
//            pstmt.close();
//            conn.close();
//            System.out.println("User added.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void removeUser(String username) {
//        // Usuwanie użytkownika z bazy danych
//        try {
//            Connection conn = dbConnector.getConnection();
//            String deleteSql = "DELETE FROM users WHERE username = ?";
//            PreparedStatement pstmt = conn.prepareStatement(deleteSql);
//            pstmt.setString(1, username);
//            pstmt.executeUpdate();
//            pstmt.close();
//            conn.close();
//            System.out.println("User removed.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
