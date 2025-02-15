package com.bridgelabz.Springsecurity.controller;

import com.bridgelabz.Springsecurity.model.Student;
import com.bridgelabz.Springsecurity.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService student;

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return student.getAllStudent();
    }
    @GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest request)
    {
        return (CsrfToken)request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student stud)
    {
        student.addStudent(stud);
    }
}
