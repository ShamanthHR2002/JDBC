package com.xworkz.bus.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bus_table")
public class BusDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "bus_name")
	private String bustName;
	
	
	@Column(name = "price")
	private double price;
	
	
	public BusDto() {
	}


	public BusDto(String bustName, double price) {
		super();
		this.bustName = bustName;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBustName() {
		return bustName;
	}


	public void setBustName(String bustName) {
		this.bustName = bustName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
}
