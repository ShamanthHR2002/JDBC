package com.xworkz.operation.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.operation.entity.PersonEntity;

public class GetCountbyEmailandDate {
	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		Query query = eManager.createNamedQuery("GetCountbyEmailandDate");
		query.setParameter("email", "sachin12@gmail.com");
		query.setParameter("createdAt", "2024-12-09 10:34:55.745570");
		

		List<PersonEntity> persons = query.getResultList();

		for (PersonEntity person : persons) {
			System.out.println(person);
		}

		eManager.close();
		emFactory.close();
	}
}
