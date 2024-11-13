package com.xworkz.constants;

public enum ConnectionConstTv {
	URL("jdbc:mysql://localhost:3306/tv"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionConstTv(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
