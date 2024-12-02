package com.springmvc.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping ("/show-form")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping ("/process-form")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping ("/process-form-v2")
    public String letsShout(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo! " + theName;
        model.addAttribute("message" , result);
        return "helloworld";
    }

}
