package com.mynewshop.mynewshopapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_id")
    private Integer cartId;
    @Column(name="user_id")
    private Integer userId;
    @Column(name="product_id")
    private Integer productId;
    @Column(name="product_price")
    private Integer productPrice;
    @Column(name="Quantity")
    private Integer quantity;
    @Column(name="product_Name")
    private String productName;

    public Cart() {}

    public Cart(Integer userId, Integer productId, Integer productPrice, Integer quantity, String productName) {
        this.userId = userId;
        this.productId = productId;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.productName = productName;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                ", productName='" + productName + '\'' +
                '}';
    }
}
