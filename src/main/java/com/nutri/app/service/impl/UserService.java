package com.nutri.app.service.impl;

import com.nutri.app.entity.User;
import com.nutri.app.repository.UserRepository;
import com.nutri.app.service.IUserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(String name, String email) {

    }

    @Override
    public void updateUser(Long id, String name, String email) {
    }

    @Override
    public void deleteUser(Long id) {
    }

    @Override
    public String getUser(String username) {
        return "Hola " + username;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
