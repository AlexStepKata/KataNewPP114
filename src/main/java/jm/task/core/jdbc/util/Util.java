package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";




    public static Connection getConnection() {
        Connection connection = null;
        try {connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            if (connection != null)
                System.out.println ("Приложение подключилось к БД !");
            else
                System.out.println ("Приложение НЕ подключилось к БД ?");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
