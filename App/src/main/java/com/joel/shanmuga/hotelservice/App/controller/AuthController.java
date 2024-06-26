package com.joel.shanmuga.hotelservice.App.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/auth")
public class AuthController {

    @PostMapping("/register")
    public ResponseEntity<String> register(){
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(){
        return null;
    }
}
