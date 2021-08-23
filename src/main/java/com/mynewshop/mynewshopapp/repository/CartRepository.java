package com.mynewshop.mynewshopapp.repository;

import com.mynewshop.mynewshopapp.model.Cart;
import com.mynewshop.mynewshopapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


public interface CartRepository extends JpaRepository<Cart, Integer> {
    @Transactional
    @Modifying
    @Query("update Cart c set c.quantity=?1 where c.userId=?2 AND c.productId=?3")
    void updateCart(Integer quantity,Integer userId, Integer productId);

    @Query("select c from Cart c where c.userId=?1 AND c.productId=?2")
    List<Cart> toCheckCart(Integer userId, Integer productId);

    @Query("select c from Cart c where c.userId=:theid")
    List<Cart> byuserid(@Param("theid") Integer userId);

}
