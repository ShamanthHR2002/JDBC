package com.xworkz.preparedstaements.food;

public enum EnumConnection {

	URL("jdbc:mysql://localhost:3306/food"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private String value;

	private EnumConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
