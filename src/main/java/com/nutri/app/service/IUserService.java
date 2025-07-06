package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.User;

public interface IUserService {
    // Define methods for user-related operations
    void createUser(String name, String email);

    void updateUser(Long id, String name, String email);

    void deleteUser(Long id);

    String getUser(String username);

    List<User> getAllUsers();
    // Other user-related methods can be added here
}
