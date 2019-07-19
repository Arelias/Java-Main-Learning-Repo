package com.kodilla.good.patterns.challenges.three.manufacturer;

import com.kodilla.good.patterns.challenges.three.Order;
import com.kodilla.good.patterns.challenges.three.OrderDto;
import com.kodilla.good.patterns.challenges.three.Product;

import java.util.Map;

public class GlutenFreeShop extends Manufacturer {

    public GlutenFreeShop(String localisation) {
        super(localisation);
    }

    @Override
    public OrderDto process(Order order) {

        //jezeli zamowienie jest ponizej jakiejs wartosci to tez odmawia
        OrderDto output =  new OrderDto(order.getUser().getUserName(), order.getDesignatedDeliveryDate(), order.getId());
        double orderValue = 0;
        for(Map.Entry<Product, Integer> position : order.getShoppingCart().entrySet()){
           orderValue += position.getKey().getValue() * position.getValue();
        }
        if (orderValue < 100) {
            output.setFailReason("Chosen order is too small");
        } else {
            output.setOrderConfirmed(true);
        }
        return output;
    }
}
