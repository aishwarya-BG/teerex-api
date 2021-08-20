package com.mynewshop.mynewshopapp.service;


import com.mynewshop.mynewshopapp.model.Orderline;
import com.mynewshop.mynewshopapp.repository.OrderlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderlineServiceImp implements OrderlineService{

    @Autowired
    private OrderlineRepository orderlineRepository;

    @Override
    public List<Orderline> findAll() {
        return orderlineRepository.findAll();
    }

    @Override
    public void save(Orderline orderlist) {
        orderlineRepository.save(orderlist);
    }

    @Override
    public Optional<Orderline> findById(Integer theId) {
        return orderlineRepository.findById(theId);
    }

    @Override
    public void deleteById(Integer theId) {
        orderlineRepository.deleteById(theId);
    }
}
