package com.kodilla.good.patterns.challenges.three;

import com.kodilla.good.patterns.challenges.three.manufacturer.Manufacturer;

import java.time.LocalDate;
import java.util.Map;

public class User {

    protected String userName;
    protected String localisation;

    public User(String userName, String localisation) {
        this.userName = userName;
        this.localisation = localisation;
    }

    public boolean order(Manufacturer manufacturer, Map<Product, Integer> shoppingCart, LocalDate desiredDelivery) {

        Order order = new Order(this, shoppingCart, desiredDelivery);
        OrderDto orderDto = manufacturer.process(order);
        if(orderDto.isOrderConfirmed()){
            System.out.println("Order created!");
        } else {
            System.out.println("Order failed: ");
        }

        System.out.println(orderDto);
        return orderDto.isOrderConfirmed();
    }

    public String getUserName() {
        return userName;
    }

    public String getLocalisation() {
        return localisation;
    }
}
