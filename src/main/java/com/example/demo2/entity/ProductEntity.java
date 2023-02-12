package com.example.demo2.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table (name="my_products")
public class ProductEntity {
    @Id
    @Column(name="product_id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long productId;

    @Column(name="product_desc")
    private String productDesc;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private Double productPrice;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}
