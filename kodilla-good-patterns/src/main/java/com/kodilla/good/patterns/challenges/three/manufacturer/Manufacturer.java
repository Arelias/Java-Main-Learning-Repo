package com.kodilla.good.patterns.challenges.three.manufacturer;

import com.kodilla.good.patterns.challenges.three.Order;
import com.kodilla.good.patterns.challenges.three.OrderDto;

public abstract class Manufacturer {

    String localisation;

    public Manufacturer(String localisation) {
        this.localisation = localisation;
    }

    public abstract OrderDto process(Order order);
}
