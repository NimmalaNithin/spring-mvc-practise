package com.springmvc.thymeleaf.controller;

import com.springmvc.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/show-student-form")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "student-form";
    }

    @PostMapping("/process-student-form")
    public String processForm(@ModelAttribute("student") Student student){
        System.out.println("the student: "+student.getFirstName()+" "+student.getLastName());

        return "student-confirmation";
    }
}