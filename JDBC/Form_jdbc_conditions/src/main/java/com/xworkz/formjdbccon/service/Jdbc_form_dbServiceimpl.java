package com.xworkz.formjdbccon.service;

import com.xworkz.formjdbccon.dto.Data_Validation_DB;
import com.xworkz.formjdbccon.repo.Jdbc_form_dbRepository;
import com.xworkz.formjdbccon.repo.Jdbc_form_dbRepositoryimpl;

public class Jdbc_form_dbServiceimpl implements Jdbc_form_dbService {

    @Override
    public boolean validateandsave(Data_Validation_DB dvdb) {
        boolean isValid = true;

        if (dvdb != null) {
            String name = dvdb.getName();
            if (name != null && !name.isEmpty() && name.length() > 6 && name.length() < 14) {
                System.out.println("Valid Name");
            } else {
                System.out.println("Invalid Name");
                isValid = false;
            }

            int age = dvdb.getAge();
            if (age >  5) {
                System.out.println("Age is Valid");
            } else {
                System.out.println("Age is Invalid");
                isValid = false;
            }

            String email = dvdb.getEmail();
            if ((email.charAt(0) <'A' || email.charAt(0) > 'Z') ||  (email.length() < 8 || email.charAt(7) != '@') ||  (!email.endsWith("@gmail.com"))) {
            	    System.out.println("Invalid Email");
            	    isValid = false;
            	} else {
            	    System.out.println("Valid Email");
            	}


            long contactNumber = dvdb.getContactNumber();
            if (String.valueOf(contactNumber).length() == 10 && String.valueOf(contactNumber).charAt(0)==('9')) {
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
