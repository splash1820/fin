package com.Finance.exmanager.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Business getBusiness() {
      return business;
    }

    public void setBusiness(Business business) {
      this.business = business;
    }

    @Column(name = "expense_name", nullable = false)
    private String expenseName;

    @Column(name = "expense_amount", nullable = false)
    private BigDecimal expenseAmount;

    @Column(name = "expense_date", nullable = false)
    private LocalDate expenseDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

    // Getters, setters, and other methods
}
