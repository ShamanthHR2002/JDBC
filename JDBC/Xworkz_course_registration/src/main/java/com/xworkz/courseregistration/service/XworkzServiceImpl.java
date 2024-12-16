package com.xworkz.courseregistration.service;


import com.xworkz.courseregistration.dto.XworkzDTO;
import com.xworkz.courseregistration.entity.XworkzEntity;
import com.xworkz.courseregistration.repository.XworkzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class XworkzServiceImpl implements XwrokzService {

    public XworkzServiceImpl() {
        System.out.println("This is service implementation class");
    }

    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#&()\\-\\[\\]{}:;',?/*~$^+=<>]).{8,20}$";

    private final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);


    XworkzEntity entity = new XworkzEntity();

    @Autowired
    XworkzRepository xworkzRepository;

    String masg;

    @Override
    public String save(XworkzDTO dto) {

        boolean saved = false;

        if (dto != null) {
            // Validate name
            String name = dto.getName();
            if (name != null && name.length() >= 10) {
                System.out.println("Name is valid: " + name);

                // Validate age
                int age = dto.getAge();
                if (age > 18) {
                    System.out.println("The age is valid: " + age);

                    // Validate email
                    String email = dto.getEmail();
                    if (email != null && email.contains("@") && email.endsWith("gmail.com")) {
                        System.out.println("The email is correct: " + email);

                        // Validate password
                        String password = dto.getPassword();
                        if (password != null && !password.isEmpty()) {
                            if (pattern.matcher(password).matches()) {
                                System.out.println("Password is valid: " + password);

                                // Validate confirm password
                                String confirmPassword = dto.getConfirmPassword();
                                if (confirmPassword != null && confirmPassword.equals(password)) {
                                    System.out.println("Password and confirm password match.");

                                    // Validate phone number
                                    long phNo = dto.getPhno();
                                    String phNoStr = String.valueOf(phNo);
                                    if (phNoStr.length() == 10 && phNoStr.startsWith("9")) {
                                        System.out.println("The number is correct: " + phNoStr);

//
                                        entity.setName(dto.getName());
                                        entity.setAge(dto.getAge());
                                        entity.setEmail(dto.getEmail());
                                        entity.setPassword(dto.getPassword());
                                        entity.setConfirmPassword(dto.getConfirmPassword());
                                        entity.setPhno(dto.getPhno());

                                        System.out.println("Saving entity: " + entity);
                                        saved = xworkzRepository.onSave(entity);

                                        if (saved) {
                                            System.out.println("Entity saved successfully.");
//                                          saved =  true;
                                            masg = "Entity saved successfully";
                                        } else {
                                            System.out.println("Failed to save the entity.");
                                            masg = "Data is not saved";
                                        }
                                    } else {
                                        System.out.println("The phone number is not valid.");
                                        masg = "phone number is not valid";
                                    }
                                } else {
                                    System.out.println("Password and confirm password do not match.");
                                    masg = "password and confirm password doesnot match";
                                }
                            } else {
                                System.out.println("Password does not meet the requirements.");
                                masg = "Password does not meet the requirment";
                            }
                        } else {
                            System.out.println("Password cannot be null or empty.");
                            masg = "Password can not be null";
                        }
                    } else {
                        System.out.println("The email is not correct.");
                        masg = "Email is not correct";
                    }
                } else {
                    System.out.println("The age is not valid.");
                    masg = "Age is not valid";
                }
            } else {
                System.out.println("Name is not valid.");
                masg = "Name is not valid";
            }
        } else {
            System.out.println("DTO cannot be null.");
            masg = "DTo can not be null";
        }
        return masg;
    }

    @Override
    public boolean validate(XworkzDTO dto) {
        boolean saved = false;


        if (dto != null) {
            // Validate name
            String name = dto.getName();
            if (name != null && name.length() >= 10) {
                System.out.println("Name is valid: " + name);
                saved = true;
            } else if (dto.getAge() > 18) {
                System.out.println("The age is valid: " + dto.getAge());
                saved = true;
            } else if (dto.getEmail() != null && dto.getEmail().contains("@") && dto.getEmail().endsWith("gmail.com")) {
                System.out.println("The email is correct.");
                saved = true;
            } else if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
                if (pattern.matcher(dto.getPassword()).matches()) {
                    System.out.println("Password is valid: " + dto.getPassword());
                    saved = true;
                } else {
                    System.out.println("Password does not meet the requirements.");
                    return false;
                }
            } else if (dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getConfirmPassword())) {
                System.out.println("Password and confirm password match.");
                saved = true;
            } else if (dto.getPhno() == 10) {
                System.out.println("The number is correct: ");
                saved = true;
            } else {
                System.out.println("The number is not valid");
                saved = false;
            }
        } else {
            return false;
        }
        return saved;
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {

        String name = xworkzRepository.getNameByEmailAndPassword(email, password);


        System.out.println("NAme from service:" + name);
        return name;
    }

}
