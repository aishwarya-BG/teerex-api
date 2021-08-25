package com.mynewshop.mynewshopapp.repository;

import com.mynewshop.mynewshopapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where p.categoryId=:theid")
    List<Product> bycategory(@Param("theid") Integer categoryId);
}
