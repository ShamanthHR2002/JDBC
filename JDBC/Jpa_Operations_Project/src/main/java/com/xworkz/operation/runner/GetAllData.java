package com.xworkz.operation.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.operation.entity.PersonEntity;

public class GetAllData {

	public static List<PersonEntity> getAllPersons() {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();

		List<PersonEntity> persons = eManager.createQuery("SELECT p FROM PersonEntity p", PersonEntity.class).getResultList();
		eManager.close();
		return persons;
	}

	public static void main(String[] args) {
		List<PersonEntity> persons = getAllPersons();
		for (PersonEntity ref : persons) {
			System.out.println(ref);
		}
	}

}
