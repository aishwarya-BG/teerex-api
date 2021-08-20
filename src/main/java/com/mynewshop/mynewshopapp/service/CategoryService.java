package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Category> findAll();

    void save(Category category);

    Optional<Category> findById(Integer theId);

    void deleteById(Integer theId);
}
