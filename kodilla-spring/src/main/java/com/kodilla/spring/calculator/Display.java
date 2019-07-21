package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Display {

    public void displayValue(double val){
        System.out.println("Value is: " + val);
    }
}
