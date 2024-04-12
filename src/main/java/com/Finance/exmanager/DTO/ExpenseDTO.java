package com.Finance.exmanager.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExpenseDTO {
    private Long id;
    private String expenseName;
    private BigDecimal expenseAmount;
    private LocalDate expenseDate;
    private Long businessId;
    public Long getId() {
      return id;
    }
    public void setId(Long id) {
      this.id = id;
    }
    public String getExpenseName() {
      return expenseName;
    }
    public void setExpenseName(String expenseName) {
      this.expenseName = expenseName;
    }
    public BigDecimal getExpenseAmount() {
      return expenseAmount;
    }
    public void setExpenseAmount(BigDecimal expenseAmount) {
      this.expenseAmount = expenseAmount;
    }
    public LocalDate getExpenseDate() {
      return expenseDate;
    }
    public void setExpenseDate(LocalDate expenseDate) {
      this.expenseDate = expenseDate;
    }
    public Long getBusinessId() {
      return businessId;
    }
    public void setBusinessId(Long businessId) {
      this.businessId = businessId;
    }

   
}
