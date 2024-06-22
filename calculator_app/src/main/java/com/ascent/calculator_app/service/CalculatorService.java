package com.ascent.calculator_app.service;
import com.ascent.calculator_app.model.Numbers;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    Numbers numbers;

    public double addition(double num1, double num2) {
        return num1 + num2;
    }
    public double substraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2)
    {
        if (num2 != 0)
        {
            return num1 / num2;
        } else {
            System.out.println("Enter num2 greater than 0");
        }
        return -1;
    }
}