package com.mynewshop.mynewshopapp.repository;

import com.mynewshop.mynewshopapp.model.Orderline;
import com.mynewshop.mynewshopapp.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShippingRepository extends JpaRepository<Shipping, Integer> {
    @Query("select s from Shipping s where s.orderId=:theid")
    List<Shipping> byorderId(@Param("theid") Integer orderId);

    @Query("select s from Shipping s where s.userid=:theid")
    List<Shipping> byuserId(@Param("theid") Integer userId);
}
