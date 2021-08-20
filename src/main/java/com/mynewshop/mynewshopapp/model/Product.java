package com.mynewshop.mynewshopapp.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer productId;
    @Column(name="product_name")
    private String productName;
    @Column(name="product_img")
    private String productImg;
    @Column(name="product_desc")
    private String productDesc;
    @Column(name="is_active")
    private String isActive;
    @Column(name="product_size")
    private String productSize;
    @Column(name="product_stock")
    private Integer productStock;
    @Column(name="product_colour")
    private String productColour;
    @Column(name="product_prize")
    private Integer productPrize;
    @Column(name="category_id")
    private Integer categoryId;


    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "product_id")
    private List<Orderline> Orderlines;

    public Product() {}

    public Product(String productName, String productImg, String productDesc, String isActive, String productSize, Integer productStock, String productColour, Integer productPrize, Integer categoryId) {
        this.productName = productName;
        this.productImg = productImg;
        this.productDesc = productDesc;
        this.isActive = isActive;
        this.productSize = productSize;
        this.productStock = productStock;
        this.productColour = productColour;
        this.productPrize = productPrize;
        this.categoryId = categoryId;
    }


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductColour() {
        return productColour;
    }

    public void setProductColour(String productColour) {
        this.productColour = productColour;
    }

    public Integer getProductPrize() {
        return productPrize;
    }

    public void setProductPrize(Integer productPrize) {
        this.productPrize = productPrize;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productImg=" + productImg + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", isActive='" + isActive + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productStock=" + productStock +
                ", productColour='" + productColour + '\'' +
                ", productPrize=" + productPrize +
                "categoryId=" + categoryId +
                '}';
    }
}
