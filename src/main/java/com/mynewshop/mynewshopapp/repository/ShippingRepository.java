package com.mynewshop.mynewshopapp.repository;

import com.mynewshop.mynewshopapp.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Integer> {
}
