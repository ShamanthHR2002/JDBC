package com.xworkz.operation.service;

import com.xworkz.operation.entity.PersonEntity;
import com.xworkz.operation.repository.PersonRepo;
import com.xworkz.operation.repository.PersonRepoImpl;

public class PersonServiceImpl implements PersonService {
	@Override
	public boolean save(PersonEntity entity) {
		System.out.println("entity==" + entity.toString());

		PersonRepo personRepo = new PersonRepoImpl();
		personRepo.save(entity);
		return false;
	}

	@Override
	public boolean update() {

		return false;
	}

}
