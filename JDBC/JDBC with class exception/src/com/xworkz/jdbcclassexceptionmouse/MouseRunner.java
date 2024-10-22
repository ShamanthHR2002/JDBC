package com.xworkz.jdbcclassexceptionmouse;

public class MouseRunner {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("loading......");
			Class.forName("com.xworkz.jdbcclassexceptionmouse.Mouse");

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
