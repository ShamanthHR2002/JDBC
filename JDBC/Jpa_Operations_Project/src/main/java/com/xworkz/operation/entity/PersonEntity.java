package com.xworkz.operation.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "personsdata")
@NamedQuery(name = "findByName", query = "SELECT p FROM PersonEntity p WHERE p.name = :name")
@NamedQuery(name = "findByEmail", query = "SELECT p FROM PersonEntity p WHERE p.email = :email")
@NamedQuery(name = "findByPhone", query = "SELECT p FROM PersonEntity p WHERE p.phone = :phone")
@NamedQuery(name = "findByAgeGreaterThan", query = "SELECT p FROM PersonEntity p WHERE p.age > :age")
@NamedQuery(name = "findByActiveStatus", query = "SELECT p FROM PersonEntity p WHERE p.active = :active")
@NamedQuery(name = "findByCreationDate", query = "SELECT p FROM PersonEntity p WHERE p.createdAt >= :date")
@NamedQuery(name = "findAllPersons", query = "SELECT p FROM PersonEntity p")
@NamedQuery(name = "updateByEmailAndPhone", query = "UPDATE PersonEntity p SET p.name = :newName WHERE p.email = :email AND p.phone = :phone")
@NamedQuery(name = "getAllDetailsById", query = "SELECT p FROM PersonEntity p WHERE p.id = :id")
@NamedQuery(name = "updateByPhoneAndActive", query = "UPDATE PersonEntity p SET p.name = :newName WHERE p.phone = :phone AND p.active = :active")
@NamedQuery(name = "updateActiveByPhone", query = "UPDATE PersonEntity p SET p.active = :active WHERE p.phone = :phone")
@NamedQuery(name = "deleteByNameAndAge", query = "DELETE FROM PersonEntity p WHERE p.name = :name AND p.age = :age")
public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	private int age;
	private boolean active;
	private LocalDateTime createdAt;

	public PersonEntity() {
		this.createdAt = LocalDateTime.now();
	}

	public PersonEntity(String name, String email, long phone, int age, boolean active) {
		this();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.active = active;
	}

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ ", active=" + active + ", createdAt=" + createdAt + "]";
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
