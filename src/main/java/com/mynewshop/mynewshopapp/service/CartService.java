package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Cart;

import java.util.List;
import java.util.Optional;

public interface CartService {
    public List<Cart> findAll();

    void save(Cart cart);

    Optional<Cart> findById(Integer theId);

    void deleteById(Integer theId);
}
