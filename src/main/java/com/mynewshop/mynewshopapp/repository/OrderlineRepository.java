package com.mynewshop.mynewshopapp.repository;


import com.mynewshop.mynewshopapp.model.Orderline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderlineRepository extends JpaRepository<Orderline, Integer> {
}
