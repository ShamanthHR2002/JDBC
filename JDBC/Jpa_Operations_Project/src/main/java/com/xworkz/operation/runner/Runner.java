package com.xworkz.operation.runner;

import com.xworkz.operation.entity.PersonEntity;
import com.xworkz.operation.service.PersonService;
import com.xworkz.operation.service.PersonServiceImpl;

public class Runner { 
    public static void main(String[] args) {
        
        PersonEntity entity = new PersonEntity("Chethan", "chethan123@gmail.com", 9449978965L, 25, false);

        
        PersonService personService = new PersonServiceImpl();
        personService.save(entity);
    }
}
