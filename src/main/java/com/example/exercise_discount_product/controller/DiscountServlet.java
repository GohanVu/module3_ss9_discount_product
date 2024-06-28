package com.example.exercise_discount_product.controller;
import com.example.exercise_discount_product.service.ICalculatorService;
import com.example.exercise_discount_product.service.impl.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    private ICalculatorService calculatorService = new CalculatorService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));
        double discount = calculatorService.discount(listPrice,percent);
        
        request.setAttribute("discount_amount",discount);
        request.setAttribute("listPrice",listPrice);
        request.setAttribute("percent",percent);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}