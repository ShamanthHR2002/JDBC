package com.xworkz.operation.runner;
import java.util.List;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.operation.dto.OperationDto;

public class Updaterunner2 {
	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		List<OperationDto> list = eManager.createQuery("select cd.name, cd.phoneNo from OperationDto cd where cd.age >15", OperationDto.class)
				.getResultList();
		
		for(OperationDto dto: list) {
			System.out.println("OperationDto = "+ dto.getName() + ", "+ dto.getAge());
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}finally {
			emFactory.close();
			eManager.close();
		}
	}
}
