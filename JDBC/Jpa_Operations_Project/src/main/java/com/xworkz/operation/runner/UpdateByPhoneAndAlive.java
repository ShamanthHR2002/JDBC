package com.xworkz.operation.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateByPhoneAndAlive {
	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			Query query = eManager.createNamedQuery("updateActiveByPhone");

			query.setParameter("active", false);
			query.setParameter("phone", 9449706521L);

			int rowsUpdated = query.executeUpdate();

			System.out.println("Rows updated: " + rowsUpdated);

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
