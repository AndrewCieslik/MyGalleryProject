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

    public int findAvailableId() {
        int availableId = 1;

        boolean found = false;

        do {
            ResultSet rs = null;
            PreparedStatement pstmt = null;

            try {
                String query = "SELECT user_id FROM users WHERE user_id = ? OR user_id = ?";
                pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, availableId);
                pstmt.setInt(2, availableId + 1);

                rs = pstmt.executeQuery();

                int firstId = 0;
                int secondId = 0;

                while (rs.next()) {
                    int userId = rs.getInt("user_id");
                    if (userId == availableId) {
                        firstId = userId;
                    } else if (userId == availableId + 1) {
                        secondId = userId;
                    }
                    if (secondId == firstId + 1) {
                        availableId = secondId + 1;
                    }
                }

                if (secondId != firstId + 1) {
                    found = true;
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } while (!found);

        return availableId;
    }


}