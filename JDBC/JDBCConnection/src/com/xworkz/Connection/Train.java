package com.xworkz.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Train {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			if (connection != null) {
				System.out.println("Successfully Connected");

			} else {
				System.out.println("Not connected");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
