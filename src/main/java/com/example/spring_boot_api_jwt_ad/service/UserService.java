package com.example.spring_boot_api_jwt_ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_api_jwt_ad.authen.UserPrincipal;
import com.example.spring_boot_api_jwt_ad.entity.User;
import com.example.spring_boot_api_jwt_ad.repository.UserRepository;
@Service
public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
    List<User> getAllUsers();
}
