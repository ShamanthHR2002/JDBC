package com.xworkz.jpa.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.jpa.dto.CricketDto;

public class CricketRunner {

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

		CricketDto cricketDto = new CricketDto();
		cricketDto.setId(2);
		cricketDto.setPlate(5);
		cricketDto.setFoodtype("idli");

		entityTransaction.begin();
		entityManager.persist(cricketDto);
		entityTransaction.commit();

		System.out.println("Values are stored in the database.");

		entityManager.close();
		eMF.close();
	}
}
