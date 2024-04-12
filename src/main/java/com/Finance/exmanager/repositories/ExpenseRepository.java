package com.Finance.exmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Finance.exmanager.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // Add custom query methods if needed
}