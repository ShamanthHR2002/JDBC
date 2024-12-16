package com.xworkz.courseregistration.repository;


import com.xworkz.courseregistration.entity.XworkzEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

@Repository
public class XworkzRepoImpl implements XworkzRepository {

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
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            return false;
        } finally {
            entityManager.close();
        }
        return true;
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("getNameByEmailAndPassword");
        query.setParameter("email", email);
        query.setParameter("password", password);

        List<String> result = query.getResultList();
        System.out.println(result);
        if (result.isEmpty()) {
            return null;
        } else if (result.size() > 1) {
            System.out.println("Multiple Names with same email and password");
        }

        return result.get(0);
    }

    @Override
    public XworkzEntity findByemail(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("SELECT e FROM XworkzEntity e WHERE e.email = :email");
        query.setParameter("email", email);

        List<XworkzEntity> result = query.getResultList();
        if (!result.isEmpty()) {
            return result.get(0);
        }
        return null;
    }
}

