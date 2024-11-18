package com.xworkz.formjdbc.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.formjdbc.constants.ConnectionConstants;
import com.xworkz.formjdbc.dto.Data_Validation_DB;

public class Jdbc_form_dbRepositoryimpl implements Jdbc_form_dbRepository {
	@Override
	public boolean save(Data_Validation_DB dvdb) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ConnectionConstants.URL.getValue(),
					ConnectionConstants.USERNAME.getValue(), ConnectionConstants.PASSWORD.getValue());

			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO Form_table (name, age, email, contact_number) VALUES (?, ?, ?, ?)");

			preparedStatement.setString(1, dvdb.getName());
			preparedStatement.setInt(2, dvdb.getAge());
			preparedStatement.setString(3, dvdb.getEmail());
			preparedStatement.setString(4, String.valueOf(dvdb.getContactNumber()));

			int save = preparedStatement.executeUpdate();

			return save > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

}
