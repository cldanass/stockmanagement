package com.example.stockmanagementbackend.service;

public interface LoginServiceInterface {
    boolean authenticate(String email, String password);
}
