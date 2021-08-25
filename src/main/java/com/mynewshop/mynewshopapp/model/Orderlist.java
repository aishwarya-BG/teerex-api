package com.mynewshop.mynewshopapp.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Orderlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private Integer orderId;
    @Column(name="user_id")
    private Integer userId;
    @Column(name="order_status")
    private String orderStatus;
    @Column(name="total_price")
    private Integer totalPrice;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "shipped_date")
    private Date shippedDate;
    @Column(name = "estimated_arrivaldate")
    private Date estimatedArrivaldate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "order_id")
    private List<Orderline> Orderlines;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "order_id")
    private List<Shipping> Shippings;

    public Orderlist(Integer userId, String orderStatus, Integer totalPrice, Date createdDate, Date shippedDate, Date estimatedArrivaldate, List<Orderline> orderlines) {
        this.userId = userId;
        this.orderStatus = orderStatus;
        this.totalPrice = totalPrice;
        this.createdDate = createdDate;
        this.shippedDate = shippedDate;
        this.estimatedArrivaldate = estimatedArrivaldate;
        Orderlines = orderlines;
    }

    public Orderlist() {}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer order_id) {
        this.orderId = order_id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String order_status) {
        this.orderStatus = order_status;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer total_price) {
        this.totalPrice = total_price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date created_date) {
        this.createdDate = created_date;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shipped_date) {
        this.shippedDate = shipped_date;
    }

    public Date getEstimatedArrivaldate() {
        return estimatedArrivaldate;
    }

    public void setEstimatedArrivaldate(Date estimated_arrivaldate) {
        this.estimatedArrivaldate = estimated_arrivaldate;
    }

    public List<Orderline> getOrderlines() {
        return Orderlines;
    }

    public void setOrderlines(List<Orderline> orderlines) {
        Orderlines = orderlines;
    }

    public List<Shipping> getShippings() {
        return Shippings;
    }

    public void setShippings(List<Shipping> shippings) {
        Shippings = shippings;
    }

    @Override
    public String toString() {
        return "Orderlist{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderStatus='" + orderStatus + '\'' +
                ", totalPrice=" + totalPrice +
                ", createdDate=" + createdDate +
                ", shippedDate=" + shippedDate +
                ", estimatedArrivaldate=" + estimatedArrivaldate +
                ", Orderlines=" + Orderlines +
                '}';
    }
}

