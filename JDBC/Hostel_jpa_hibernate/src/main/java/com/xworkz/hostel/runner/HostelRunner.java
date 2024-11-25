package com.xworkz.hostel.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.hostel.dto.HostelDto;

public class HostelRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (eMF != null) {
			System.out.println("Connected to the database.");
		} else
		{
			System.out.println("Connection failed.");
		}

		HostelDto  hostelDto = new HostelDto();
		hostelDto.setId(2);
		hostelDto.setName("sdmit");
		hostelDto.setStudents("shashank");

		entityTransaction.begin();
		entityManager.persist(hostelDto);
		entityTransaction.commit();

		System.out.println("Values are stored in the database.");

		entityManager.close();
		eMF.close();
	}
}
