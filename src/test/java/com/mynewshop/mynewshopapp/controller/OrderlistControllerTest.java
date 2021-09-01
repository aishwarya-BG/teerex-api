package com.mynewshop.mynewshopapp.controller;

import com.mynewshop.mynewshopapp.model.Orderlist;
import com.mynewshop.mynewshopapp.repository.OrderlistRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderlistControllerTest {

    @Autowired
    OrderlistRepository orderlistRepository;

    @Test
    void testByUserId() {
        List<Orderlist> orderlists = orderlistRepository.byuserid(1);
        assertThat(orderlists).size().isEqualTo(3);
    }

    @Test
    void testUpdate() {
        orderlistRepository.updateStatus("Shipped", 123);
        Orderlist orderlist1 = null;
        Optional<Orderlist> orderlist = orderlistRepository.findById(123);
        if(orderlist.isPresent())
        {
            orderlist1 = orderlist.get();
        }
        assertEquals("Shipped", orderlist1.getOrderStatus());
    }

}