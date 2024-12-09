package com.xworkz.operation.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.operation.entity.PersonEntity;

public class Countagegreaterthan5 {
	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		Query query = eManager.createNamedQuery("findByAgeGreaterThan");
		query.setParameter("age", 15);

		List<PersonEntity> persons = query.getResultList();

		if (persons != null && !persons.isEmpty()) {
			System.out.println("Persons with age greater than " + 15 + ":");
			for (PersonEntity person : persons) {
				System.out.println(person);
			}
		} else {
			System.out.println("No persons found with age greater than " + 15);
		}

		eManager.close();
		emFactory.close();
	}

}
