package com.springmvc.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/show-form")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping ("/process-form")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping ("/process-form-v2")
    public String processFormV2(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo! " + theName;
        model.addAttribute("message" , result);
        return "helloworld";
    }

    @PostMapping("/process-form-v3")
    public String processFormV3(@RequestParam("studentName") String theName, Model model){
        theName = theName.toUpperCase();
        String result = "from v3! " + theName;
        model.addAttribute("message" , result);
        return "helloworld";
    }

}
