package com.xworkz.insertdatausingjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FruitRunner {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fruits";
        String userName = "root";
        String password = "Xworkzodc@123";
        
        String insertQuery = "insert into fruits_data values (20, 'Jamun', 'white')";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            int value = statement.executeUpdate(insertQuery);
            if (value > 0) {
                System.out.println("Data saved successfully");
            } else {
                System.out.println("Data not saved");
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
