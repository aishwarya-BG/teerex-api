package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Orderlist;
import com.mynewshop.mynewshopapp.repository.OrderlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderlistServiceImp implements OrderlistService{

    @Autowired
    private OrderlistRepository orderlistRepository;

    @Override
    public List<Orderlist> findAll() {
        return orderlistRepository.findAll();
    }

    @Override
    public Orderlist save(Orderlist orderlist) {
       return orderlistRepository.save(orderlist);
    }

    @Override
    public Optional<Orderlist> findById(Integer theId) {
        return orderlistRepository.findById(theId);
    }

    @Override
    public void deleteById(Integer theId) {
        orderlistRepository.deleteById(theId);
    }
}
