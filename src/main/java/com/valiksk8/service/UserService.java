package com.valiksk8.service;

import com.valiksk8.model.User;

import java.util.Optional;

public interface UserService {

    void addUser(User user);

    Optional<User> getUserByEmail(String email);

    Optional<User> verifyPassword(User userByEmail, User user);
}
