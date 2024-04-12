package com.Finance.exmanager.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "businesses")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "business_name", nullable = false)
    private String businessName;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getBusinessName() {
      return businessName;
    }

    public void setBusinessName(String businessName) {
      this.businessName = businessName;
    }

    public String getBusinessType() {
      return businessType;
    }

    public void setBusinessType(String businessType) {
      this.businessType = businessType;
    }

    public User getUser() {
      return user;
    }

    public void setUser(User user) {
      this.user = user;
    }

    public List<Product> getProducts() {
      return products;
    }

    public void setProducts(List<Product> products) {
      this.products = products;
    }

    public List<Expense> getExpenses() {
      return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
      this.expenses = expenses;
    }

    public List<Revenue> getRevenues() {
      return revenues;
    }

    public void setRevenues(List<Revenue> revenues) {
      this.revenues = revenues;
    }

    @Column(name = "business_type", nullable = false)
    private String businessType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Expense> expenses;

    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Revenue> revenues;

    // Getters, setters, and other methods
}
