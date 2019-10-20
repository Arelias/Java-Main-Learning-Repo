package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public SalamiPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7.00));
    }

    @Override
    public String getIngriedients() {
        return super.getIngriedients() + ", salami";
    }
}
