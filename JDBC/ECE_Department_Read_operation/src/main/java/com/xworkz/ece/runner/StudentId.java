package com.xworkz.ece.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.ece.entity.ECEEntity;

public class StudentId {
	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("ECE");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		
		Query query1 = eManager.createNamedQuery("findBystudentId");
		query1.setParameter("stuId", 404);

		Object obj = query1.getSingleResult();
		ECEEntity inst = (ECEEntity) obj;
		System.out.println("Value of the student Id :" + inst);


	}

}
