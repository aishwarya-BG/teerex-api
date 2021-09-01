package com.mynewshop.mynewshopapp.controller;


import com.mynewshop.mynewshopapp.model.Orderline;
import com.mynewshop.mynewshopapp.repository.OrderlineRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderlineControllerTest {

    @Autowired
    OrderlineRepository orderlineRepository;

    @Test
    void testByUserId() {
        List<Orderline> orderlines = orderlineRepository.byorderId(118);
        assertThat(orderlines).size().isEqualTo(3);
    }
}