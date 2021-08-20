package com.mynewshop.mynewshopapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Integer categoryId;
    @Column(name="category_name")
    private String categoryName;
    @Column(name="is_active")
    private Integer isActive;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "category_id")
    private List<Product> products;

    public Category() {
    }

    public Category(String categoryName, Integer isActive) {
        this.categoryName = categoryName;
        this.isActive = isActive;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String category_name) {
        this.categoryName = category_name;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer is_active) {
        this.isActive = is_active;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", isActive=" + isActive +
                '}';
    }


}
