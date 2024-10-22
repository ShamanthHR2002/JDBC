package com.xworkz.jdbcclassexceptiondosa;

public class DosaRunner {
	public static void main(String[] args) {
		try {
			System.out.println("loading......");
			Class.forName("com.xworkz.jdbcclassexceptiondosa.Dosa");

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
