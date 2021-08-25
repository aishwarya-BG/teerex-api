package com.mynewshop.mynewshopapp.repository;


import com.mynewshop.mynewshopapp.model.Orderline;
import com.mynewshop.mynewshopapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderlineRepository extends JpaRepository<Orderline, Integer> {


}
