package com.xworkz.courseregistration.repository;


import com.xworkz.courseregistration.entity.XworkzEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class XworkzRepoImpl implements XworkzRepository {

    public XworkzRepoImpl() {
        System.out.println("This is repository implmenetation");
    }

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean onSave(XworkzEntity entity) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive())
                entityTransaction.rollback();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return true;
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Query query = entityManager.createNamedQuery("getNameByEmailAndPassword");
        query.setParameter("email", email);
        query.setParameter("password", password);
        String name = (String) query.getSingleResult();
        System.out.println("Name is from repository:" + name);

        return name;
    }
}