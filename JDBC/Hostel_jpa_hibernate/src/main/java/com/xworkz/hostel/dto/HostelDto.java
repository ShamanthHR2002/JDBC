package com.xworkz.hostel.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hostel_data")
public class HostelDto {

	@Id
	private int id;

	private String name;

	private String students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudents() {
		return students;
	}

	public void setStudents(String students) {
		this.students = students;
	}

	
}
