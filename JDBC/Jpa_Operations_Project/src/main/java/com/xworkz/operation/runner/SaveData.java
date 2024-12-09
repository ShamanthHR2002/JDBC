package com.xworkz.operation.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.operation.entity.PersonEntity;

public class SaveData {
	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		List<PersonEntity> persons = new ArrayList<>();

		persons.add(new PersonEntity("Shamanth", "shamanthhr52@gmail.com", 9449706520L, 18, true));
		persons.add(new PersonEntity("Shashank", "shashank34@gmail.com", 94497065225L, 8, true));
		persons.add(new PersonEntity("Nagaraj", "nagaraj.d52@gmail.com", 9449706521L, 25, true));
		persons.add(new PersonEntity("Sachin", "sachin12@gmail.com", 9449706522L, 9, false));
		persons.add(new PersonEntity("Charan", "charan34@gmail.com", 9449918520L, 4, true));
		persons.add(new PersonEntity("Deepak", "deepak23@gmail.com", 9449706789L, 5, false));
		persons.add(new PersonEntity("Osama", "osama12@gmail.com", 912354128L, 30, true));
		persons.add(new PersonEntity("Manoj", "manoja@gmail.com", 945982014L, 27, true));
		persons.add(new PersonEntity("Suresh", "suresh.d53@gmail.com", 902587496L, 50, false));

		try {
		    eTrans.begin();
		    for (PersonEntity entity : persons) { 
		        eManager.persist(entity);
		    }
		    eTrans.commit();
		} catch (Exception e) {
		    if (eTrans.isActive()) {
		        eTrans.rollback();
		    }
		    e.printStackTrace();
		} finally {
		    eManager.close();
		    emFactory.close();
		}

	}
}
