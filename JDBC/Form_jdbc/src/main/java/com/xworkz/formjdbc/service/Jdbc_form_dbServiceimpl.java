package com.xworkz.formjdbc.service;

import com.xworkz.formjdbc.dto.Data_Validation_DB;
import com.xworkz.formjdbc.repo.Jdbc_form_dbRepository;
import com.xworkz.formjdbc.repo.Jdbc_form_dbRepositoryimpl;

public class Jdbc_form_dbServiceimpl implements Jdbc_form_dbService {

    @Override
    public boolean validateandsave(Data_Validation_DB dvdb) {
        boolean isValid = true;

        if (dvdb != null) {
            String name = dvdb.getName();
            if (name != null && !name.isEmpty() && name.length() > 2) {
                System.out.println("Valid Name");
            } else {
                System.out.println("Invalid Name");
                isValid = false;
            }

            int age = dvdb.getAge();
            if (age > 18) {
                System.out.println("Age is Valid");
            } else {
                System.out.println("Age is Invalid");
                isValid = false;
            }

            String email = dvdb.getEmail();
            if (email != null && !email.isEmpty() && email.contains("@")) {
                System.out.println("Valid Email");
            } else {
                System.out.println("Invalid Email");
                isValid = false;
            }

            long contactNumber = dvdb.getContactNumber();
            if (String.valueOf(contactNumber).length() == 10) {
                System.out.println("Valid Contact Number");
            } else {
                System.out.println("Invalid Contact Number");
                isValid = false;
            }
        }

        if(isValid) {
    		Jdbc_form_dbRepository signInRepositoryImp =new  Jdbc_form_dbRepositoryimpl();
    		 boolean isSaved= signInRepositoryImp.save(dvdb);
    		 
    		}
    		
        return isValid;
    }
}
