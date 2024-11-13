package com.xworkz.preparedstaements.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FoodRunner {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = null;

			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(),
					EnumConnection.PASSWORD.getValue());

			PreparedStatement prst = null;

			prst = connection.prepareStatement("insert into foods_data values(?, ? , ?)");
			prst.setString(1, "1");
			prst.setString(2, "2");
			prst.setString(3, "Dosa");

			int value = prst.executeUpdate();
			if (value > 0) {
				System.out.println("Saved");
			} else {
				System.err.println("Data not saved");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
