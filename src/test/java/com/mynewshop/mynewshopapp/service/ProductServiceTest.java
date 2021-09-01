package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.Category;
import com.mynewshop.mynewshopapp.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Test
    void testSave() {
        Product p = new Product();
        p.setProductName("Taehyungie Style");
        p.setProductColour("White");
        p.setProductPrize(150);
        p.setProductSize("L");
        p.setCategoryId(1);
        Product savedProduct = productService.save(p);
        assertNotNull(savedProduct.getProductId());
    }

    @Test
    void testProductByCategory() {
        List<Product> products = productService.bycategory(13);
        assertThat(products).size().isEqualTo(4);
    }

}