package com.mynewshop.mynewshopapp.controller;

import com.mynewshop.mynewshopapp.model.Category;
import com.mynewshop.mynewshopapp.model.Product;
import com.mynewshop.mynewshopapp.model.User;
import com.mynewshop.mynewshopapp.repository.CategoryRepository;
import com.mynewshop.mynewshopapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoryapi")
@CrossOrigin(origins = "http://localhost:3000/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public List<Category> findAll()
    {
        return categoryService.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody Category category) {
        categoryService.save(category);
    }

    @GetMapping("category/{theId}")
    public Optional<Category> findById(@PathVariable Integer theId)
    {
        return categoryService.findById(theId);
    }

    @DeleteMapping("category/{theId}")
    public void deleteById(@PathVariable Integer theId)
    {
        categoryService.deleteById(theId);
    }
}
