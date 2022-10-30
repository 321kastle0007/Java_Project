package com.example.mp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnector {

    static Connection connection = null;

    public static Connection getConnection() {
        String databaseName = "educator";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        String username = "root";
        String password = "RickC137";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Database connected!");
            return connection;
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Database connection failure!");
        }

        return connection;
    }
}
