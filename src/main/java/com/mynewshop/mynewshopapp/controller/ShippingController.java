package com.mynewshop.mynewshopapp.controller;

import com.mynewshop.mynewshopapp.model.Category;
import com.mynewshop.mynewshopapp.model.Product;
import com.mynewshop.mynewshopapp.model.Shipping;
import com.mynewshop.mynewshopapp.model.User;
import com.mynewshop.mynewshopapp.repository.CategoryRepository;
import com.mynewshop.mynewshopapp.repository.ShippingRepository;
import com.mynewshop.mynewshopapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shippingapi")
@CrossOrigin(origins = "http://localhost:3000/")
public class ShippingController {

    @Autowired
    private ShippingRepository shippingRepository;

    @GetMapping("list")
    public List<Shipping> findAll()
    {
        return shippingRepository.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody Shipping shipping) {
        shippingRepository.save(shipping);
    }

    @GetMapping("shipping/{theId}")
    public Optional<Shipping> findById(@PathVariable Integer theId)
    {
        return shippingRepository.findById(theId);
    }

    @DeleteMapping("shipping/{theId}")
    public void deleteById(@PathVariable Integer theId)
    {
        shippingRepository.deleteById(theId);
    }
}
