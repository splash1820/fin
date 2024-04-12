package com.Finance.exmanager.DTO;

import java.math.BigDecimal;

public class ProductDTO {
    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private int productQuantity;
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
    public Long getBusinessId() {
      return businessId;
    }
    public void setBusinessId(Long businessId) {
      this.businessId = businessId;
    }

    
}
