package com.xworkz.courseregistration.controller;


import com.xworkz.courseregistration.dto.XworkzDTO;
import com.xworkz.courseregistration.entity.XworkzEntity;
import com.xworkz.courseregistration.service.XwrokzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class XworkzController {

    @Autowired
    XwrokzService xworkzService;

    @PostMapping("/signupact")
    public String onsignup(XworkzDTO dto, Model model) {
        System.out.println(dto);
        Map<String, String> validationErrors = xworkzService.validate(dto);
        if (validationErrors.isEmpty()) {
            boolean isSaved = xworkzService.save(dto);
            String msg = isSaved ? "Registration successful" : "Registration failed.";
            model.addAttribute("message", msg);
            return "login";
        } else {
            model.addAttribute("validationErrors", validationErrors);
            return "signup";
        }
    }

    @PostMapping("/getNameByEmailAndPassword")
    public String getName(String email, String password, Model model) {
        XworkzEntity userEntity = xworkzService.getUserByEmailAndPassword(email, password);

        if (userEntity != null) {
            model.addAttribute("user", userEntity);
            return "login";
        } else {
            model.addAttribute("message", "Check Email And Password");
            return "login";
        }
    }

}
