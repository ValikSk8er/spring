package com.valiksk8.service;

import com.valiksk8.model.User;

public interface UserService {

    User getUserByEmail(String email);
}
