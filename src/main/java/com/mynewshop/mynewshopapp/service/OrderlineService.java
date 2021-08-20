package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Orderline;


import java.util.List;
import java.util.Optional;

public interface OrderlineService {
    List<Orderline> findAll();

    void save(Orderline orderline);

    Optional<Orderline> findById(Integer theId);

    void deleteById(Integer theId);
}
