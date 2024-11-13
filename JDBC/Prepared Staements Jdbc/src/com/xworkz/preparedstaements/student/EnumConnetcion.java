package com.xworkz.preparedstaements.student;

public enum EnumConnetcion {

	URL("jdbc:mysql://localhost:3306/student"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private String value;

	private EnumConnetcion(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
