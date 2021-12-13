package model.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    public Connection connectDataBase() {
        final String URL = "jdbc:mysql://localhost:3306/bai_thi?useSSL=false";
        final String USER = "root";
        final String PASSWORD = "123456";

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                return connection;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
