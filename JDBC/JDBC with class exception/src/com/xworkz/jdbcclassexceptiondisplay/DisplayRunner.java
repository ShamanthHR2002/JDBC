package com.xworkz.jdbcclassexceptiondisplay;

public class DisplayRunner {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("loading......");
			Class.forName("com.xworkz.jdbcclassexceptiondisplay.Display");

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
