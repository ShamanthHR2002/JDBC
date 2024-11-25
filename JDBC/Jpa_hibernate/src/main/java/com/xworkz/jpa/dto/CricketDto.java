package com.xworkz.jpa.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foods_data")
public class CricketDto {

	@Id
	private int id;

	private int plate;

	private String foodtype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlate() {
		return plate;
	}

	public void setPlate(int plate) {
		this.plate = plate;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}



	
}
