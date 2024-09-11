package com.localityconnector.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.localityconnector.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    // Endpoint for login
    @PostMapping("/authenticate")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        boolean isAuthenticated = loginService.authenticate(user.getUsername(), user.getPassword());
        if (isAuthenticated) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    // Endpoint to register a new user
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User newUser = loginService.register(user);
        return ResponseEntity.ok(newUser);
    }

    // Endpoint to check login status
    @GetMapping("/status")
    public ResponseEntity<String> checkStatus() {
        return ResponseEntity.ok("You are logged in");
    }
}
