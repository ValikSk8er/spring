package com.valiksk8.dao;

import com.valiksk8.model.User;

public interface UserDao {

    void addUser(User user);

    User getByEmail(String email);

}
