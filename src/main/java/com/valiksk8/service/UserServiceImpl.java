package com.valiksk8.service;

import com.valiksk8.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User getUserByEmail(String email) {
        System.out.println(email);
        return null;
    }
}
