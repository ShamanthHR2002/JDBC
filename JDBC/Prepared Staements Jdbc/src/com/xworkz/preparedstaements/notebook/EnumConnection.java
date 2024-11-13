package com.xworkz.preparedstaements.notebook;

public enum EnumConnection {

	URL("jdbc:mysql://localhost:3306/notebook"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private String value;

	private EnumConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
