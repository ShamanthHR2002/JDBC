package com.xworkz.operation.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.operation.entity.PersonEntity;

public class GetAllDetailsById {
	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		Query query = eManager.createNamedQuery("getAllDetailsById");
		query.setParameter("id", 8);

		PersonEntity person = (PersonEntity) query.getSingleResult();

		System.out.println("Person Details: " + person);

		eManager.close();
		emFactory.close();
	}
}
