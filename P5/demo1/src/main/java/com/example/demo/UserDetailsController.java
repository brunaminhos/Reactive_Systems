package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserDetailsController {
    @GetMapping("/")
    public String UserDetailsForm(Model model){
        model.addAttribute("details", new UserDetails());
        return "form";
    }
    @PostMapping("/displayDetails")
    public String userDetailsSubmit(@ModelAttribute UserDetails userDetails, Model model){
        model.addAttribute("details", userDetails);
        return "result";
    }
}
