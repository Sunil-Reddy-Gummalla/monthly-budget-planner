package com.budgetplanner.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.budgetplanner.app.entity.Expense;
import com.budgetplanner.app.repo.ExpenseRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;
    
    @GetMapping("/")
    public String dummy() {
        return "Happy New Year";
    }

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @PostMapping("/expenses")
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseRepository.save(expense);
    }
}

