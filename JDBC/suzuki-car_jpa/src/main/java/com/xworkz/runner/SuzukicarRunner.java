package com.xworkz.runner;

import java.util.List;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.suzukidto.SuzukicarDto;

public class SuzukicarRunner {

	public static void main(String[] args) {
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		List<SuzukicarDto> list = new ArrayList<>();
		list.add(new SuzukicarDto("Suzuki", "Alto K10", "Manual,AMT", "Red", "24.39 kmpl", "66 bhp", "90 Nm", "5seat",
				"5.96 Lakh"));
		list.add(new SuzukicarDto("Suzuki", "Swift", "Manual,AMT", "black", "21.2 kmpl", "83 bhp", "113 Nm", "5seat",
				"6.49 Lakh"));
		list.add(new SuzukicarDto("Suzuki", "Wagon", "Manual,AMT", "Multiple", "29.92 kmpl", "68 bhp", "90 Nm", "5seat",
				"6.54 Lakh"));
		list.add(new SuzukicarDto("Suzuki", "Celerio", "Manual,AMT", "Multiple", "23.1 kmpl", "67 bhp", "90 Nm",
				"5seat", "5.36 Lakh"));
		list.add(new SuzukicarDto("Suzuki", "Eeco", "Manual,AMT", "Multiple", "22.0 kmpl", "89 bhp", "113 Nm", "5seat",
				"8.79 Lakh"));
		list.add(new SuzukicarDto("Suzuki", "Dzire", "Manual,AMT", "Multiple", "23.1 kmpl", "67 bhp", "90 Nm", "5seat",
				"5.36 Lakh"));
		list.add(new SuzukicarDto("Suzuki", "Ertiga", "Manual,AMT", "Multiple", "20.1 kmpl", "89 bhp", "113 Nm",
				"5seat", "9.34 Lakh"));
		list.add(new SuzukicarDto("Suzuki", "Fronx", "Manual,AMT", "Multiple", "23.1 kmpl", "89 bhp", "113 Nm", "5seat",
				"8.36 Lakh"));
		list.add(new SuzukicarDto("Suzuki", "Grand Vitara", "Manual,AMT", "Multiple", "18.1 kmpl", "103 bhp", "151 Nm",
				"5seat", "12.87 Lakh"));
		for (SuzukicarDto car : list) {
			SuzukicarDto dto = new SuzukicarDto();
			dto.setCarName(car.getCarName());
			dto.setModel(car.getModel());
			dto.setTransmission(car.getTransmission());
			dto.setColor(car.getColor());
			dto.setMileage(car.getMileage());
			dto.setHorsepower(car.getHorsepower());
			dto.setTorque(car.getTorque());
			dto.setSeatingCapacity(car.getSeatingCapacity());
			dto.setPrice(car.getPrice());

		}
		try {
		    eT.begin();
		    for (SuzukicarDto car : list) {
		        eM.persist(car); 
		    }
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
