package com.Finance.exmanager.services;

import java.util.List;

import com.Finance.exmanager.model.Expense;

public interface ExpenseService {
    Expense createExpense(Expense expense);
    Expense getExpense(Long id);
    List<Expense> getAllExpenses();
    Expense updateExpense(Long id, Expense expense);
    void deleteExpense(Long id);
}
