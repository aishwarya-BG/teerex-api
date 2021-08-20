package com.mynewshop.mynewshopapp.controller;

import com.mynewshop.mynewshopapp.model.Category;
import com.mynewshop.mynewshopapp.model.Orderlist;
import com.mynewshop.mynewshopapp.service.OrderlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("orderapi")
@CrossOrigin(origins = "http://localhost:3000/")
public class OrderlistController {

    @Autowired
    private OrderlistService orderlistService;

    @GetMapping("list")
    public List<Orderlist> findAll()
    {
        return orderlistService.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody Orderlist orderlist) {
        orderlistService.save(orderlist);
    }

    @GetMapping("order/{theId}")
    public Optional<Orderlist> findById(@PathVariable Integer theId)
    {
        return orderlistService.findById(theId);
    }

    @DeleteMapping("order/{theId}")
    public void deleteById(@PathVariable Integer theId)
    {
        orderlistService.deleteById(theId);
    }


}
