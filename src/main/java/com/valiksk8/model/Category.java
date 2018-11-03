package com.valiksk8.model;

//import com.valiksk8.metadata.ColumnName;
//import com.valiksk8.metadata.TableName;

import java.util.List;

//@TableName("CATEGORIES")
public class Category {

//    @ColumnName("ID")
    private Long id;

//    @ColumnName("CATEGORY_NAME")
    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(Long id, String name) {
        this(name);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}