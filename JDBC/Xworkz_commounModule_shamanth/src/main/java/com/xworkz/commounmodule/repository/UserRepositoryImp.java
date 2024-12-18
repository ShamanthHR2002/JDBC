package com.xworkz.commounmodule.repository;

import com.xworkz.commounmodule.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserRepositoryImp {


    public boolean save(UserEntity userEntity) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz.commounmodule");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(userEntity);
            et.commit();

        } catch (Exception e) {
            if (et.isActive())
                et.rollback();
        } finally {
            em.close();
            emf.close();
        }
        return true;
    }


}

