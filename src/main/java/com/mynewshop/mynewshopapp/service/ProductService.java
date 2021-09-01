package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Category;
import com.mynewshop.mynewshopapp.model.Product;
import com.mynewshop.mynewshopapp.model.User;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> findAll();

    public List<Product> bycategory(Integer categoryId);

    Product save(Product product);

    Optional<Product> findById(Integer theId);

    void deleteById(Integer theId);
}
