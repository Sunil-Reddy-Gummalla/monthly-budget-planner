package com.budgetplanner.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "expenses")
public class Expense {
    @Id
    private String id;
    private String category;
    private double amount;
    private String date;

    // Getters and Setters
}

