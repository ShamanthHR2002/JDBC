package com.xworkz.bus.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bus.dto.BusDto;

public class BusInsRunner {
	public static void main(String[] args) {
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("bus");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		try {
			eT.begin();
			BusDto busDto = new BusDto("ksrtc", 1050);
			eM.persist(busDto);
			eT.commit();
		} catch (Exception e) {
			if (eT.isActive()) {
				eT.rollback();
			}
			e.printStackTrace();
		} finally {
			eM.close();
			emF.close();
		}
	}
}
