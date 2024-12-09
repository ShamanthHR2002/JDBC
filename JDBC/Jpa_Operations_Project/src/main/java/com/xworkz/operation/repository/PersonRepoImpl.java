package com.xworkz.operation.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.operation.entity.PersonEntity;

public class PersonRepoImpl implements PersonRepo {
	
	@Override
	public boolean save(PersonEntity entity) {

		System.out.println("this is repo==" + entity.toString());

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		try {
			entityTransaction.begin();

			em.persist(entity);
			entityTransaction.commit();

		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}

		} finally {
			em.close();
			entityManagerFactory.close();
		}

		return false;
	}

}
