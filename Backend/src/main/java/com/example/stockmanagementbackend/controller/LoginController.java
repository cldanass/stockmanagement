package com.example.stockmanagementbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Assuming you have the following classes in your project
import com.example.stockmanagementbackend.service.LoginService;
import com.example.stockmanagementbackend.model.LoginRequest;
import com.example.stockmanagementbackend.model.LoginResponse;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        // Authenticate user
        boolean isAuthenticated = loginService.authenticate(email, password);

        if (isAuthenticated) {
            // Return success response or generate JWT token
            String token = generateToken(); // Implement your token generation logic
            return ResponseEntity.ok(new LoginResponse("Login successful", token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    // Implement your token generation logic here
    private String generateToken() {
        // Example: Use JWT library to generate a token
        // Replace this with your actual token generation logic
        return "sample_jwt_token";
    }
}
