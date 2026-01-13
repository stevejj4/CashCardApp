package com.example.cashcard.Model;

import org.springframework.data.annotation.Id;

// A simple immutable data class using Java record
public record CashCard(@Id Long id, Double amount) {
}