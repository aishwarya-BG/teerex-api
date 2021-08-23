package com.mynewshop.mynewshopapp.controller;


import com.mynewshop.mynewshopapp.model.Cart;
import com.mynewshop.mynewshopapp.model.Product;
import com.mynewshop.mynewshopapp.repository.CartRepository;
import com.mynewshop.mynewshopapp.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cartapi")
@CrossOrigin(origins = "http://localhost:3000/")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private CartRepository cartRepository;

    @GetMapping("list")
    public List<Cart> findAll()
    {
        return cartService.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody Cart cart) {
        cartService.save(cart);
    }

    @GetMapping("cart/{theId}")
    public Optional<Cart> findById(@PathVariable Integer theId)
    {
        return cartService.findById(theId);
    }

    @DeleteMapping("cart/{theId}")
    public void deleteById(@PathVariable Integer theId)
    {
        cartService.deleteById(theId);
    }

    @PutMapping("update")
    public void updateCart(@RequestBody Cart cart) { cartRepository.updateCart(cart.getQuantity(), cart.getUserId(), cart.getProductId());}

    @PostMapping("check")
    public List<Cart> checkCart(@RequestBody Cart cart)
    {
        return cartRepository.toCheckCart(cart.getUserId(), cart.getProductId());
    }

    @GetMapping("/id/{userId}")
    public List<Cart> byuserId(@PathVariable Integer userId)
    {
        return cartRepository.byuserid(userId);
    }

    @DeleteMapping("remove")
    public void removefromcart(@RequestBody Cart cart){
        cartRepository.removefromcart(cart.getUserId(), cart.getProductId());
    }
}
