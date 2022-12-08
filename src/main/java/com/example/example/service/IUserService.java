package com.example.example.service;

import com.example.example.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {
    void createNewUser(User user);
}
