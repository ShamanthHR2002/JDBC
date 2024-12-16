package com.xworkz.courseregistration.service;


import com.xworkz.courseregistration.dto.XworkzDTO;
import com.xworkz.courseregistration.entity.XworkzEntity;
import com.xworkz.courseregistration.repository.XworkzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class XworkzServiceImpl implements XwrokzService {

    @Autowired
    private XworkzRepository xworkzRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public boolean save(XworkzDTO dto) {
        Map<String, String> errorMessages = validate(dto);
        if (!errorMessages.isEmpty()) {
            return false;
        }

        String encryptedPassword = passwordEncoder.encode(dto.getPassword());

        XworkzEntity entity = new XworkzEntity();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        entity.setPassword(encryptedPassword);
        entity.setPhonenumber(dto.getPhonenumber());

        return xworkzRepository.onSave(entity);
    }

    @Override
    public Map<String, String> validate(XworkzDTO dto) {
        Map<String, String> errorMessages = new HashMap<>();

        if (dto.getName() == null || dto.getName().length() < 10) {
            errorMessages.put("name", "Name should be at least 10 characters long.");
        }

        if (dto.getAge() < 18) {
            errorMessages.put("age", "Age should be greater than or equal to 18.");
        }

        if (dto.getEmail() == null || !dto.getEmail().contains("@gmail.com")) {
            errorMessages.put("email", "Email should be a valid Gmail address.");
        }


        if (dto.getPassword() == null || !dto.getPassword().equals(dto.getConfirmPassword())) {
            errorMessages.put("confirmPassword", "Password and Confirm Password should match.");
        }
        if (dto.getPassword() == null || dto.getPassword().length() < 7) {
            errorMessages.put("password", "Password should be at least 7 characters long.");
        }

        String passwordPattern = "(?=.*[a-zA-Z])(?=.*[0-9]).{7,}";
        if (dto.getPassword() != null && !dto.getPassword().matches(passwordPattern)) {
            errorMessages.put("password", "Password should contain at least one letter and one digit.");
        }
        return errorMessages;
    }


    @Override
    public XworkzEntity getUserByEmailAndPassword(String email, String password) {
        XworkzEntity userEntity = xworkzRepository.findByemail(email);
        if (userEntity != null && passwordEncoder.matches(password, userEntity.getPassword())) {
            return userEntity;
        }
        return null;
    }

}

