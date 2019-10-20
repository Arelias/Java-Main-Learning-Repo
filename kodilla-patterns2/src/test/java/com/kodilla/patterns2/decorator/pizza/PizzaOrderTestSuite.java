package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String ingriedients = pizzaOrder.getIngriedients();
        //Then
        assertEquals(new BigDecimal(15.00), calculatedCost);
        assertEquals("Thin crust, tomato sauce, cheese", ingriedients);
    }
    @Test
    public void testSpicyPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HabanerosPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new TabascoSaucePizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String ingriedients = pizzaOrder.getIngriedients();
        //Then
        assertEquals(new BigDecimal(25.00), calculatedCost);
        assertEquals("Thin crust, tomato sauce, cheese, habaneros peppers, tabasco sauce", ingriedients);
    }
    @Test
    public void testKingPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HabanerosPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new TabascoSaucePizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new SalamiPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ThickCrustPizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String ingriedients = pizzaOrder.getIngriedients();
        //Then
        assertEquals(new BigDecimal(44.00), calculatedCost);
        assertEquals("Thin crust, tomato sauce, cheese, habaneros peppers, tabasco sauce, " +
                "extra cheese, salami, extra thick crust", ingriedients);
    }
}
