package com.valiksk8.dao;

import com.valiksk8.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//теж саме що сервыс тіки ставиться над дао
@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addUser(User user) {
        jdbcTemplate.update("INSERT INTO USERS (EMAIL, PASSWORD, TOKEN, FIRST_NAME, LAST_NAME) " +
                "VALUES (?, ?, ?, ?, ?)",
                user.getEmail(),
                user.getPassword(),
                user.getToken(),
                user.getFirstName(),
                user.getLastName());
    }

    @Override
    public User getByEmail(String email) {



        return null;
    }
}
