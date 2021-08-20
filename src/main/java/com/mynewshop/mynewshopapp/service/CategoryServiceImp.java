package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Category;
import com.mynewshop.mynewshopapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryServiceImp implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Optional<Category> findById(Integer theId) {
        return categoryRepository.findById(theId);
    }

    @Override
    public void deleteById(Integer theId) {
        categoryRepository.deleteById(theId);
    }
}
