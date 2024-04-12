package com.Finance.exmanager.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RevenueDTO {
    private Long id;
    private String productName;
    private int quantitySold;
    private BigDecimal salePrice;
    private LocalDate saleDate;
    private Long businessId;
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
    public int getQuantitySold() {
      return quantitySold;
    }
    public void setQuantitySold(int quantitySold) {
      this.quantitySold = quantitySold;
    }
    public BigDecimal getSalePrice() {
      return salePrice;
    }
    public void setSalePrice(BigDecimal salePrice) {
      this.salePrice = salePrice;
    }
    public LocalDate getSaleDate() {
      return saleDate;
    }
    public void setSaleDate(LocalDate saleDate) {
      this.saleDate = saleDate;
    }
    public Long getBusinessId() {
      return businessId;
    }
    public void setBusinessId(Long businessId) {
      this.businessId = businessId;
    }

    
}
