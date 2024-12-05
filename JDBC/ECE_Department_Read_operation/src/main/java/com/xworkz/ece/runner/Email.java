package com.xworkz.ece.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Email {
	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("ECE");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		

		Query query = eManager.createNamedQuery("findNameByEmail");
		query.setParameter("getEmail", "bhanuprakash123@gmail.com");
		Object obj = query.getSingleResult();
		String str = (String) obj;
		System.out.println("Values : " + str);
		
		try {
			eTrans.begin();
			eTrans.commit();

		} catch (Exception e) {
			if (eTrans.isActive()) {
				eTrans.rollback();
			}
		} finally {
			eManager.close();
			emFactory.close();
		}
	}

}
