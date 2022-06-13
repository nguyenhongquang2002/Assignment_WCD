package com.example.Assignment_WCD.model;

import com.example.Assignment_WCD.entity.Category;

import java.util.List;

public interface CategoryModel {
    boolean save(Category category);
    boolean update(int id ,Category category);
    boolean delete(int id);
    List<Category> findByAll();
    Category findById(int id);
}
