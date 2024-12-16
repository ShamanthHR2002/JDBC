package com.xworkz.courseregistration.Controller;

import com.xworkz.courseregistration.dto.XworkzDTO;
import com.xworkz.courseregistration.service.XwrokzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class XworkzController {

    public XworkzController() {
        System.out.println("This is controller class");
    }

    @Autowired
    XwrokzService xwrokzService;

    @PostMapping("/getData")
    public String method(XworkzDTO dto, Model model) {
        System.out.println("The dto is: " + dto);


        boolean check = xwrokzService.validate(dto);
        if (check) {
            String msg = xwrokzService.save(dto);
            model.addAttribute("Name", msg);
            model.addAttribute("Age", msg);
            model.addAttribute("email", msg);
            model.addAttribute("password", msg);
            model.addAttribute("phno", msg);
            return "login";
        }
        return "signup";
    }

    @PostMapping("/getNameByEmailAndPassword")
    public String getName(String email, String password, Model model) {
        System.out.println("The data is :" + email);
        String name = xwrokzService.getNameByEmailAndPassword(email, password);
        System.out.println("Nmae from controller:" + name);
        model.addAttribute("name", name);
        return "login";
    }

}