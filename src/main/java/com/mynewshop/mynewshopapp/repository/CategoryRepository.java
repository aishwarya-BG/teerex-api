package com.mynewshop.mynewshopapp.repository;

import com.mynewshop.mynewshopapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
