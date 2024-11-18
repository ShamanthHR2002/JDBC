package com.xworkz.formjdbc.dto;

public class Data_Validation_DB {
	private String name;
	private int age;
	private String email;
	private long contactNumber;

	public Data_Validation_DB(String name, int age, String email, long contactNumber) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
}
