package com.mynewshop.mynewshopapp.repository;

import com.mynewshop.mynewshopapp.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
