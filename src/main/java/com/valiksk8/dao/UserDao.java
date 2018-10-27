package com.valiksk8.dao;

import com.valiksk8.model.User;

import java.util.Optional;

public interface UserDao {

    void addUser(User user);

    Optional<User> getByEmail(String email);

}
