package com.bridgelabz.Springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String greet(HttpServletRequest request)
    {
        // Printing Session id...
        return "Hello User.. Your session id: "+request.getSession().getId();
    }


}
