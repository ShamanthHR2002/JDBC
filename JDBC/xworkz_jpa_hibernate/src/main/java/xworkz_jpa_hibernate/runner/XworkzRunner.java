package xworkz_jpa_hibernate.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import xworkz_jpa_hibernate.dto.XworkzBtmDto;
import xworkz_jpa_hibernate.dto.XworkzDto;

public class XworkzRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();

			XworkzDto xworkzDto = new XworkzDto();
			xworkzDto.setId(1);
			xworkzDto.setName("shamanth");
			xworkzDto.setEmail("shamanth@gmail.com");
			em.merge(xworkzDto);

			xworkzDto.setId(2);
			xworkzDto.setName("shashank");
			xworkzDto.setEmail("shashank@gmail.com");
			em.merge(xworkzDto);

			xworkzDto.setId(2);
			xworkzDto.setName("nagaraj");
			xworkzDto.setEmail("nagaraj@gmail.com");
			
			

			em.merge(xworkzDto);
			et.commit();

			XworkzBtmDto xworkzBtmDto1 = new XworkzBtmDto();
			xworkzBtmDto1.setId(1);
			xworkzBtmDto1.setName("likith");
			xworkzBtmDto1.setEmail("likith@gmail.com");
			em.merge(xworkzBtmDto1);

			xworkzBtmDto1.setId(1);
			xworkzBtmDto1.setName("kiran");
			xworkzBtmDto1.setEmail("kiran@gmail.com");

			em.merge(xworkzBtmDto1);
			et.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}
}
