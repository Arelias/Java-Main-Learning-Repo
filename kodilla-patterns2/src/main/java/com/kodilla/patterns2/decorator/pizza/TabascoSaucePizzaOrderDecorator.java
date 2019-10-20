package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TabascoSaucePizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public TabascoSaucePizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.00));
    }

    @Override
    public String getIngriedients() {
        return super.getIngriedients() + ", tabasco sauce";
    }
}
