package com.Finance.exmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Finance.exmanager.DTO.ExpenseDTO;
import com.Finance.exmanager.model.Expense;
import com.Finance.exmanager.util.DTOMapper;
import com.Finance.exmanager.util.DTOMapper.ExpenseMapper;

import com.Finance.exmanager.services.ExpenseService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<ExpenseDTO> createExpense(@RequestBody ExpenseDTO expenseDTO) {
        Expense expense = DTOMapper.ExpenseMapper.mapFromExpense(expenseDTO);
        Expense savedExpense = expenseService.createExpense(expense);
        return new ResponseEntity<>(DTOMapper.ExpenseMapper.mapToExpense(savedExpense), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpenseDTO> getExpense(@PathVariable Long id) {
        Expense expense = expenseService.getExpense(id);
        return ResponseEntity.ok(DTOMapper.ExpenseMapper.mapToExpense(expense));
    }

    @GetMapping
    public ResponseEntity<List<ExpenseDTO>> getAllExpenses() {
        List<Expense> expenses = expenseService.getAllExpenses();
        List<ExpenseDTO> expenseDTOs = expenses.stream()
                .map(ExpenseMapper::mapToExpense)
                .collect(Collectors.toList());
        return ResponseEntity.ok(expenseDTOs);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExpenseDTO> updateExpense(@PathVariable Long id, @RequestBody ExpenseDTO expenseDTO) {
        Expense expense = ExpenseMapper.mapFromExpense(expenseDTO);
        Expense updatedExpense = expenseService.updateExpense(id, expense);
        return ResponseEntity.ok(ExpenseMapper.mapToExpense(updatedExpense));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return ResponseEntity.noContent().build();
    }
}
