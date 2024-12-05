package com.xworkz.ece.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MobileNoyName {
	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("ECE");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("findMobileNoByName");
		query.setParameter("setName", "Shamanth");
		Object obj= query.getSingleResult();
		Long ref= (Long)obj;
		System.out.println("Value of the OfficeNo :"+ref);
		
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
