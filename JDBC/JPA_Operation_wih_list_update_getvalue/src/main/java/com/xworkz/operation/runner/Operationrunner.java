package com.xworkz.operation.runner;

import java.util.List;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.operation.dto.OperationDto;

public class Operationrunner {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emFactory.createEntityManager();
		EntityTransaction eTrans = em.getTransaction();
		List<OperationDto> list = new ArrayList<OperationDto>();
		list.add(new OperationDto("Ausha", "anusha@gmail.com", 23, 9449706512L));
		list.add(new OperationDto("Aravind", "aravind@gmail.com", 22, 9449706511L));
		list.add(new OperationDto("Ashwath", "ashwath23@gmail.com", 21, 9449706510L));
		list.add(new OperationDto("Banuprakash", "banu@gmail.com", 23, 9449706529L));
		list.add(new OperationDto("Chran", "chran@gmail.com", 22, 9449706528L));
		list.add(new OperationDto("Dharshan", "dharshan@gmail.com", 23, 9449706527L));
		list.add(new OperationDto("Dharma", "dharma@gmail.com", 25, 9449706526L));
		list.add(new OperationDto("Harisha", "harisha@gmail.com", 19, 9449706525L));
		list.add(new OperationDto("Mani", "mani@gmail.com", 20, 9449706524L));
		list.add(new OperationDto("Nani", "nani@gmail.com", 20, 9449706523L));
		list.add(new OperationDto("Tharesh", "tharesh@gmail.com", 21, 9449706522L));
		list.add(new OperationDto("Veena", "veena@gmail.com", 21, 9449706521L));

		for (OperationDto OperationDto : list) {

			em.persist(OperationDto);
		}

		try {
			eTrans.begin();
			eTrans.commit();

		} catch (Exception e) {
			if (eTrans.isActive()) {
				eTrans.rollback();
			}
		} finally {
			em.close();
			emFactory.close();
		}
	}
}
