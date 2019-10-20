package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HabanerosPizzaOrderDecorator extends AbstractPizzaOrderDecorator{
    public HabanerosPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6.00));
    }

    @Override
    public String getIngriedients() {
        return super.getIngriedients() + ", habaneros peppers";
    }
}
