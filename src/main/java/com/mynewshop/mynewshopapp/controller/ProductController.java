package com.mynewshop.mynewshopapp.controller;


import com.mynewshop.mynewshopapp.model.Product;
import com.mynewshop.mynewshopapp.repository.ProductRepository;
import com.mynewshop.mynewshopapp.repository.UserRepository;
import com.mynewshop.mynewshopapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("productapi")
@CrossOrigin(origins = "http://localhost:3000/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public List<Product> findAll()
    {
        return productService.findAll();
    }

    @GetMapping("/id/{categoryId}")
    public List<Product> bycategory(@PathVariable Integer categoryId)
    {
        return productService.bycategory(categoryId);
    }

    @PostMapping("save")
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("products/{theId}")
    public Optional<Product> findById(@PathVariable Integer theId)
    {
        return productService.findById(theId);
    }

    @DeleteMapping("products/{theId}")
    public void deleteById(@PathVariable Integer theId)
    {
        productService.deleteById(theId);
    }

}
