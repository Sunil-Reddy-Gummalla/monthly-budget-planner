package com.budgetplanner.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.budgetplanner.app.entity.Expense;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
