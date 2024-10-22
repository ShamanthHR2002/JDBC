package com.xworkz.jdbcclassexceptionswitch;

public class SwitchRunner {
	public static void main(String[] args) {
		
	
	try {
		System.out.println("loading......");
		Class.forName("com.xworkz.jdbcclassexceptionswitch.Switch");

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
