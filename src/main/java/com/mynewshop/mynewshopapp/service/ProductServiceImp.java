package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Product;
import com.mynewshop.mynewshopapp.model.User;
import com.mynewshop.mynewshopapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> bycategory(Integer categoryId) {
        List<Product> theproduct;
        theproduct = productRepository.bycategory(categoryId);
        return theproduct;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Integer theId) {
        return productRepository.findById(theId);
    }

    @Override
    public void deleteById(Integer theId) {
        productRepository.deleteById(theId);
    }
}
