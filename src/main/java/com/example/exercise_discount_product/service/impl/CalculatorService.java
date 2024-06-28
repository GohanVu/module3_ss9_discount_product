package com.example.exercise_discount_product.service.impl;

import com.example.exercise_discount_product.service.ICalculatorService;

import java.math.BigDecimal;

public class CalculatorService implements ICalculatorService {
    @Override
    public Double discount(double listPrice, double percent) {
            return listPrice * percent * 0.01;
    }
}
