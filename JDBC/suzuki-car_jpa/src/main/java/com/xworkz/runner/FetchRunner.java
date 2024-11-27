package com.xworkz.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.suzukidto.SuzukicarDto;

public class FetchRunner {

	EntityManagerFactory emF = Persistence.createEntityManagerFactory("xworkz");
	EntityManager eM = emF.createEntityManager();
	EntityTransaction eT = eM.getTransaction();

	Integer id = 2;

	SuzukicarDto dto = eM.find(SuzukicarDto.class, id);

	System.out.println("Value of ID : "+dto.getCarName());

	try {
		eT.begin();
		eT.commit();
	}
	catch(
	Exception e)
	{
		if(eT.isActive()) {
			eT.rollback();
		}
		e.printStackTrace();
	}finally
	{
		eM.close();
		emF.close();
	}
}
}
