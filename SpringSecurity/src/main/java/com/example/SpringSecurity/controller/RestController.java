package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String getpage(HttpServletRequest request)
    {
        return "Hello"+ request.getSession().getId();
    }
    @GetMapping("/about")
    public String about(HttpServletRequest request)
    {
        return "this is the about us page"+ request.getSession().getId();
    }
    List<Student> stu=new ArrayList<>(List.of(
            new Student(1,"Adi"),
            new Student(2,"Aditya")
    ));
    @GetMapping("stu")
    public List<Student>getstu()
    {
        return stu;
    }
    @PostMapping("stu")
    public void addstu(@RequestBody Student student)
    {
        stu.add(student);
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request)
    {
        return (CsrfToken)request.getAttribute("_csrf");
    }
}
