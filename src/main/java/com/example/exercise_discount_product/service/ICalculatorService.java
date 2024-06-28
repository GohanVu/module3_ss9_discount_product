package com.example.exercise_discount_product.service;

import java.math.BigDecimal;

public interface ICalculatorService {
    Double discount(double listPrice, double percent);
}
