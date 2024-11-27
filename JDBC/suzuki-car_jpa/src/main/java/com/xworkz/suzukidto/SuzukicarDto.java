package com.xworkz.suzukidto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suzuki_table")
public class SuzukicarDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "car_name")
	private String carName;
	@Column(name = "model")
	private String model;
	@Column(name = "Transmission")
	private String transmission;
	@Column(name = "Color")
	private String color;
	@Column(name = "Mileage")
	private String mileage;
	@Column(name = "Horsepower")
	private String horsepower;
	@Column(name = "Torque")
	private String torque;
	@Column(name = "`Seating Capacity`") 
	private String seatingCapacity;
	@Column(name = "`Price`")
	private String price;

	public SuzukicarDto() {
	}

	public SuzukicarDto(String carName, String model, String transmission, String color, String mileage,
			String horsepower, String torque, String seatingCapacity, String price) {
		super();
		this.carName = carName;
		this.model = model;
		this.transmission = transmission;
		this.color = color;
		this.mileage = mileage;
		this.horsepower = horsepower;
		this.torque = torque;
		this.seatingCapacity = seatingCapacity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}

	public String getTorque() {
		return torque;
	}

	public void setTorque(String torque) {
		this.torque = torque;
	}

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
}
