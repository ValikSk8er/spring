package com.valiksk8.model;


import com.valiksk8.controller.external.model.RegisterUserDto;

import javax.validation.constraints.NotNull;

public class User {

    private Long id;
    @NotNull
    private String email;
    @NotNull
    private String password;
    private String token;
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(String email, String password, String verifiedPassword, String token, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.token = token;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public static User of(RegisterUserDto userDto) {
        User user = new User();
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setToken(userDto.getToken());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        return user;
    }
}