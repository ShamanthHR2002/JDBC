package com.xworkz.operation.runner;

import java.util.List;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.operation.dto.OperationDto;

public class Updaterunner1 {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		List<OperationDto> list = eManager.createQuery("select cd from ConfusingDto cd", OperationDto.class)
				.getResultList();
		for (OperationDto dto : list) {
			System.out.println("Operation List = " + dto.getName() + ", " + dto.getEmail() + ", " + dto.getAge() + " ,"
					+ dto.getPhoneNo());
		}
		try {
			eTrans.begin();
			int query = eManager
					.createQuery("UPDATE OperationDto c SET c.name = :myname, c.email = :myemail WHERE "
							+ "c.phoneNo = :phoneNo")
					.setParameter("myname", "Shamanth").setParameter("myemail", "shamanth524@gmail.com")
					.setParameter("phoneNo", Long.valueOf("9449706524")).executeUpdate();
					
				System.out.println("Update Succesfully");
			} else {
				System.err.println("Not Update");
			}
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