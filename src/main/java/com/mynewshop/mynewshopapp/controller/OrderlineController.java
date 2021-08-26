package com.mynewshop.mynewshopapp.controller;

import com.mynewshop.mynewshopapp.model.Orderline;

import com.mynewshop.mynewshopapp.repository.OrderlineRepository;
import com.mynewshop.mynewshopapp.repository.OrderlistRepository;
import com.mynewshop.mynewshopapp.service.OrderlineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("orderlineapi")
@CrossOrigin(origins = "http://localhost:3000/")
public class OrderlineController {

    @Autowired
    private OrderlineService orderlineService;

    @Autowired
    private OrderlineRepository orderlineRepository;

    @GetMapping("list")
    public List<Orderline> findAll()
    {
        return orderlineService.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody Orderline orderline) {
        orderlineService.save(orderline);
    }

    @GetMapping("orderline/{theId}")
    public Optional<Orderline> findById(@PathVariable Integer theId)
    {
        return orderlineService.findById(theId);
    }

    @DeleteMapping("orderline/{theId}")
    public void deleteById(@PathVariable Integer theId)
    {
        orderlineService.deleteById(theId);
    }

    @GetMapping("byorderid/{theId}")
    public List<Orderline> byorderId(@PathVariable Integer theId)
    {
        return orderlineRepository.byorderId(theId);
    }

}
