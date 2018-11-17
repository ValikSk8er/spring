package com.valiksk8.service;

import com.valiksk8.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    List<Category> getById(Long id);
}
