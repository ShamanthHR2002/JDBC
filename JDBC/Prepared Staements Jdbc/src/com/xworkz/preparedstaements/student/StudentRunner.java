package com.xworkz.preparedstaements.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRunner {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = null;
			connection = DriverManager.getConnection(EnumConnetcion.URL.getValue(), EnumConnetcion.USERNAME.getValue(),
					EnumConnetcion.PASSWORD.getValue());

			PreparedStatement prest1 = null;
			prest1 = connection.prepareStatement("insert into student(id, name, USN) values(?, ?, ?)");

			prest1.setString(1, "1");
			prest1.setString(2, "shamanth");
			prest1.setString(3, "1NH21EC400");

			PreparedStatement prest2 = null;
			prest2 = connection.prepareStatement("insert into student(id, name, USN) values(?, ?, ?)");

			prest2.setString(1, "2");
			prest2.setString(2, "srinivasa");
			prest2.setString(3, "1NH21EC401");

			PreparedStatement prest3 = null;
			prest3 = connection.prepareStatement("insert into student(id, name, USN) values(?, ?, ?)");

			prest3.setString(1, "3");
			prest3.setString(2, "vijay");
			prest3.setString(3, "1NH21EC402");

			PreparedStatement prest4 = null;
			prest4 = connection.prepareStatement("insert into student(id, name, USN) values(?, ?, ?)");

			prest4.setString(1, "4");
			prest4.setString(2, "bhanuprakash");
			prest4.setString(3, "1NH21EC403");

			PreparedStatement prest5 = null;
			prest5 = connection.prepareStatement("insert into student(id, name, USN) values(?, ?, ?)");

			prest5.setString(1, "5");
			prest5.setString(2, "charan");
			prest5.setString(3, "1NH21EC404");

			int values1 = prest1.executeUpdate();
			int values2 = prest2.executeUpdate();
			int values3 = prest3.executeUpdate();
			int values4 = prest4.executeUpdate();
			int value5 = prest5.executeUpdate();

			int[] values = { values1, values2, values3, values4, value5 };
			for (int i : values) {
				if (i > 0) {
					System.out.println("Data is saved");
				} else {
					System.out.println("Data is not saved");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
