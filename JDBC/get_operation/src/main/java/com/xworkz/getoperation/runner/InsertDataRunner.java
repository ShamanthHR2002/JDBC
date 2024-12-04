package com.xworkz.getoperation.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.getoperation.entity.ShopEntity;

public class InsertDataRunner {

	 public static void main(String[] args) {

	        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
	        EntityManager eManager = emFactory.createEntityManager();
	        EntityTransaction eTrans = eManager.getTransaction();

	        List<ShopEntity> list = new ArrayList<ShopEntity>();
	        list.add(new ShopEntity(111, "mysoresandlee", 30000, "electronics"));
	        list.add(new ShopEntity(214, "bigmartt", 50000, "groceries"));
	        list.add(new ShopEntity(378, "techworldd", 1500, "electronics"));
	        list.add(new ShopEntity(479, "homefurnishh", 20000, "furniture"));
	        list.add(new ShopEntity(547, "footgearr", 12000, "footwear"));
	        list.add(new ShopEntity(678, "kitchenworldd", 8000, "kitchenware"));
	        list.add(new ShopEntity(747, "fashionhubb", 20000, "fashion"));
	        list.add(new ShopEntity(878, "bookshelff", 2500, "books"));
	        list.add(new ShopEntity(998, "greenstoree", 6000, "groceries"));
	        list.add(new ShopEntity(101, "techstoree", 25000, "electronics"));
	        list.add(new ShopEntity(115, "homefurnishh", 30000, "furniture"));
	        list.add(new ShopEntity(121, "gadgetshogp", 12000, "electronics"));
	        list.add(new ShopEntity(131, "shoesandmorfe", 8000, "footwear"));
	        list.add(new ShopEntity(141, "freshmarkest", 7000, "groceries"));
	        list.add(new ShopEntity(151, "styleclothing", 15000, "clothing"));

	    

	        for (ShopEntity shop : list) {
	            eManager.persist(shop);
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
