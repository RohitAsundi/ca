package com.ascent.calculator_app.controller;

import com.ascent.calculator_app.model.Numbers;
import com.ascent.calculator_app.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculatorController {

    @Autowired
    CalculatorService calculatorService;

    @PostMapping("/add")
    public double calAddition(@RequestBody Numbers numbers){
        return calculatorService.addition(numbers.getNum1(), numbers.getNum2());
    }

    @PostMapping("/sub")
    public double calSubtraction(@RequestBody Numbers numbers){
        return calculatorService.substraction(numbers.getNum1(), numbers.getNum2());
    }

    @PostMapping("/mul")
    public double calMultiplication(@RequestBody Numbers numbers){
        return calculatorService.multiplication(numbers.getNum1(), numbers.getNum2());
    }

    @PostMapping("/div")
    public double calDivision(@RequestBody Numbers numbers){
        return calculatorService.division(numbers.getNum1(), numbers.getNum2());
    }
}
