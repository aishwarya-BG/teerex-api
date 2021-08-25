package com.mynewshop.mynewshopapp.repository;
import com.mynewshop.mynewshopapp.model.Orderline;
import com.mynewshop.mynewshopapp.model.Orderlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface OrderlistRepository extends JpaRepository<Orderlist,Integer> {
    @Query("select o from Orderlist o where o.userId=:theid")
    List<Orderlist> byuserid(@Param("theid") Integer userId);

    @Transactional
    @Modifying
    @Query("update Orderlist o set o.orderStatus=?1 where o.orderId=?2")
    void updateStatus(String orderStatus, Integer orderId);



}
