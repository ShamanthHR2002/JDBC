package com.xworkz.preparedstaements.notebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NotebookRunner {
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

			prst = connection.prepareStatement("insert into notebooks_data values(?, ? , ?, ?)");
			prst.setString(1, "1");
			prst.setString(2, "Classmate");
			prst.setString(3, "Ruled Notebooks");
			prst.setString(4, "RS40");

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
