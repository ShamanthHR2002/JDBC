package com.xworkz.getoperation.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.getoperation.entity.ShopEntity;



public class ReaderRunner {


	    public static void main(String[] args) {

	        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
	        EntityManager eManager = emFactory.createEntityManager();
	        EntityTransaction eTrans = eManager.getTransaction();

	        
	        Query query = eManager.createNamedQuery("findByShopBrandId");
	        Object obj = query.getSingleResult();
	        ShopEntity shop = (ShopEntity) obj;
	        System.out.println("Shop: " + shop);

	        
	        Query query2 = eManager.createNamedQuery("findByShopBrandName");
	        Object obj2 = query2.getSingleResult();
	        ShopEntity shop2 = (ShopEntity) obj2;
	        System.out.println("Shop: " + shop2);

	       
	        Query query3 = eManager.createNamedQuery("findByShopId");
	        Object obj3 = query3.getSingleResult();
	        ShopEntity shop3 = (ShopEntity) obj3;
	        System.out.println("Shop: " + shop3);

	        
	        Query query4 = eManager.createNamedQuery("findByShopBrandIdAndName");
	        List<ShopEntity> shops = query4.getResultList();
	        for (ShopEntity eShop : shops) {
	            System.out.println("Shop: " + eShop);
	        }

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
