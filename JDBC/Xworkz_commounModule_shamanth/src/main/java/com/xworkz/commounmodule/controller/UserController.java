
package com.xworkz.commounmodule.controller;

import com.xworkz.commounmodule.dto.UserDTO;
import com.xworkz.commounmodule.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    UserController() {
        System.out.println("running UserController...........");
    }

    @PostMapping("/signup")
    public String signup(UserDTO userDTO) {
        System.out.println(userDTO);
        boolean valid = userService.valid(userDTO);
        if (valid) {
            return "Success.jsp";
        }
        return "Signup.jsp";
    }
}