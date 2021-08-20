package com.mynewshop.mynewshopapp.repository;

import com.mynewshop.mynewshopapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where p.categoryId=:theid")
    List<Product> bycategory(@Param("theid") Integer categoryId);
}
