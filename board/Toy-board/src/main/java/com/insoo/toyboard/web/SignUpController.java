package com.insoo.toyboard.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

    @GetMapping(value ="/signUp")
    public String getSignUp(Model model){
        model.addAttribute("data", "data");

        return "signUp";
    }
}
