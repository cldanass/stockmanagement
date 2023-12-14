package com.example.stockmanagementbackend.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginServiceInterface {

    // Simulated user credentials (replace with database access)
    private static final String VALID_EMAIL = "anasthegoatt@gmail.com";
    private static final String VALID_PASSWORD = "anas1234";

    @Override
    public boolean authenticate(String email, String password) {
        // Simulate user authentication logic (replace with database access)
        return VALID_EMAIL.equals(email) && VALID_PASSWORD.equals(password);
    }
}

