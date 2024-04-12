package com.Finance.exmanager.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_price", nullable = false)
    private BigDecimal productPrice;

    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getProductName() {
      return productName;
    }

    public void setProductName(String productName) {
      this.productName = productName;
    }

    public BigDecimal getProductPrice() {
      return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
      this.productPrice = productPrice;
    }

    public int getProductQuantity() {
      return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
      this.productQuantity = productQuantity;
    }

    public Business getBusiness() {
      return business;
    }

    public void setBusiness(Business business) {
      this.business = business;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

    // Getters, setters, and other methods
}