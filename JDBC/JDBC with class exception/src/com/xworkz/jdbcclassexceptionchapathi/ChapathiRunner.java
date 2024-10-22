package com.xworkz.jdbcclassexceptionchapathi;

public class ChapathiRunner {

	public static void main(String[] args) {
		try {
			System.out.println("loading......");
			Class.forName("com.xworkz.jdbcclassexceptionchapathi.Chapathi");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC loaded......");
		} catch (ClassNotFoundException c) {

			c.printStackTrace();

		}
	}

}
