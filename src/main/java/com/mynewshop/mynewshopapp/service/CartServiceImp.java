package com.mynewshop.mynewshopapp.service;


import com.mynewshop.mynewshopapp.model.Cart;
import com.mynewshop.mynewshopapp.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CartServiceImp implements CartService{

    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public void save(Cart category) {
        cartRepository.save(category);
    }

    @Override
    public Optional<Cart> findById(Integer theId) {
        return cartRepository.findById(theId);
    }

    @Override
    public void deleteById(Integer theId) {
        cartRepository.deleteById(theId);
    }
}
