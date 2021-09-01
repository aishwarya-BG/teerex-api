package com.mynewshop.mynewshopapp.controller;


import com.mynewshop.mynewshopapp.model.Cart;
import com.mynewshop.mynewshopapp.repository.CartRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CartControllerTest {

    @Autowired
    CartRepository cartRepository;

    @Test
    void testByUserId() {
        List<Cart> carts = cartRepository.byuserid(1);
        assertThat(carts).size().isEqualTo(0);
    }
}