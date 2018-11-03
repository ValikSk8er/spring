package com.valiksk8.dao;

import com.valiksk8.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> findAll() {
        return jdbcTemplate.query("SELECT ID, CATEGORY_NAME FROM CATEGORIES",
                (resultSet, rowNum) -> new Category(
                        resultSet.getLong("ID"),
                        resultSet.getString("CATEGORY_NAME")
                ));
    }
}
