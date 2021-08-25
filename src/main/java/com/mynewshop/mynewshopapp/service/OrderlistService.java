package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Orderlist;

import java.util.List;
import java.util.Optional;

public interface OrderlistService {
    List<Orderlist> findAll();

    Orderlist save(Orderlist orderlist);

    Optional<Orderlist> findById(Integer theId);

    void deleteById(Integer theId);
}
