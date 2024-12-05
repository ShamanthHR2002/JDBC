package com.xworkz.ece.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.xworkz.ece.entity.ECEEntity;

public class InsertRunner {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("ECE");
        EntityManager eManager = emFactory.createEntityManager();
        EntityTransaction eTrans = eManager.getTransaction();

        List<ECEEntity> list = new ArrayList<>();
        list.add(new ECEEntity(400, "Amogha", "amogha123@gmail.com", "Rajesh", 9449706520L));
        list.add(new ECEEntity(401, "Bhanuprakash", "bhanuprakash123@gmail.com", "Mahendra", 9444991855L));
        list.add(new ECEEntity(402, "Chaithra", "chaithra123@gmail.com", "Amarjeeth Pal", 9475306589L));
        list.add(new ECEEntity(403, "Charankumar", "charan258@gmail.com", "Aravind", 9772248697L));
        list.add(new ECEEntity(404, "HariRohith", "harirohith159@gmail.com", "Nayana", 9008846327L));
        list.add(new ECEEntity(405, "Harish", "harish3@gmail.com", "Nagendra", 8449925749L));
        list.add(new ECEEntity(406, "Shahid", "shahid23@gmail.com", "Rajesh", 9789456123L));
        list.add(new ECEEntity(407, "Shamanth", "shamanth23@gmail.com", "Amarjeeth Pal", 9449706524L));
        list.add(new ECEEntity(408, "Srinivas", "srinivas23@gmail.com", "Nayana", 974196358L));
        list.add(new ECEEntity(409, "Vijay", "vijay789@gmail.com", "Mahendra", 8741258963L));

        try {
            eTrans.begin();
            for (ECEEntity entity : list) {
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
