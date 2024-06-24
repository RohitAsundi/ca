package com.ascent.calculator_app.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorServiceTest {

        private CalculatorService calculatorService;

        @BeforeEach
        void setUp() {
            calculatorService = new CalculatorService();
        }

        @Test
        void testAddition() {
            double result = calculatorService.addition(10.5, 5.5);
            assertEquals(16.0, result, 0.0001); // Assert that the result is equal to 16.0 with a delta of 0.0001
        }

        @Test
        void testSubtraction() {
            double result = calculatorService.substraction(10.5, 5.5);
            assertEquals(5.0, result, 0.0001); // Assert that the result is equal to 5.0 with a delta of 0.0001
        }

        @Test
        void testMultiplication() {
            double result = calculatorService.multiplication(10.5, 5.0);
            assertEquals(52.5, result, 0.0001); // Assert that the result is equal to 52.5 with a delta of 0.0001
        }

        @Test
        void testDivision() {
            double result = calculatorService.division(10.0, 5.0);
            assertEquals(2.0, result, 0.0001); // Assert that the result is equal to 2.0 with a delta of 0.0001
        }

        @Test
        void testDivisionByZero() {
            double result = calculatorService.division(10.0, 0.0);
            assertEquals(-1.0, result, 0.0001); // Assert that the result is -1.0 when dividing by zero
        }
    }


