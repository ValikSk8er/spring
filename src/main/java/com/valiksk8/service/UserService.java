package com.valiksk8.service;

import com.valiksk8.model.User;

public interface UserService {

    void addUser(User user);

    User getUserByEmail(String email);
}
