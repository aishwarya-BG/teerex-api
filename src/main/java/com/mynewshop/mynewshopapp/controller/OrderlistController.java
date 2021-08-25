package com.mynewshop.mynewshopapp.controller;

import com.mynewshop.mynewshopapp.model.Cart;
import com.mynewshop.mynewshopapp.model.Category;
import com.mynewshop.mynewshopapp.model.Orderline;
import com.mynewshop.mynewshopapp.model.Orderlist;
import com.mynewshop.mynewshopapp.repository.OrderlistRepository;
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

    @Autowired
    private OrderlistRepository orderlistRepository;

    @GetMapping("list")
    public List<Orderlist> findAll()
    {
        return orderlistService.findAll();
    }

    @PostMapping("save")
    public Orderlist save(@RequestBody Orderlist orderlist) {
        return orderlistService.save(orderlist);
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

    @GetMapping("byuser/{theId}")
    public List<Orderlist> byuserid(@PathVariable Integer theId)
    {
        return orderlistRepository.byuserid(theId);
    }

    @PutMapping("update")
    public void updateStatus(@RequestBody Orderlist orderlist) { orderlistRepository.updateStatus(orderlist.getOrderStatus(), orderlist.getOrderId());}

}
