package com.xworkz.bus.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bus.dto.BusDto;

public class BusDelRunner {
	EntityManagerFactory emF = Persistence.createEntityManagerFactory("bus");
	EntityManager eM = emF.createEntityManager();
	EntityTransaction eT = eM.getTransaction();

	try
	{
		eT.begin();
		Integer id = 9;
		BusDto busDto = new BusDto();
		BusDto bus = eM.find(BusDto.class, id);
		eM.remove(bus);
		eT.commit();
	}catch(
	Exception e)
	{
		if (eT.isActive()) {
			eT.rollback();
		}
		e.printStackTrace();
	}finally
	{
		eM.close();
		emF.close();
	}
}}
