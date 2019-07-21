package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b){
        double output = a + b;
        display.displayValue(output);

        return output;
    }
    public double subtract(double a, double b){
        double output = a - b;
        display.displayValue(output);

        return output;
    }
    public double mul(double a, double b){
        double output = a * b;
        display.displayValue(output);

        return output;
    }
    public double div(double a, double b){
        double output = a / b;
        display.displayValue(output);

        return output;
    }
}
