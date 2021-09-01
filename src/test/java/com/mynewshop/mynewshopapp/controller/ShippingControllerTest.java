package com.mynewshop.mynewshopapp.controller;

import com.mynewshop.mynewshopapp.model.Shipping;
import com.mynewshop.mynewshopapp.repository.ShippingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingControllerTest {

    @Autowired
    ShippingRepository shippingRepository;

    @Test
    public void testByOrderId() {
        List<Shipping> shippings = shippingRepository.byorderId(129);
        assertThat(shippings).size().isEqualTo(1);
    }
}