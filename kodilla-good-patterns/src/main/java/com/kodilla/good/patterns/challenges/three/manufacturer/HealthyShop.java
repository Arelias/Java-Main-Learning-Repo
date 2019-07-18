package com.kodilla.good.patterns.challenges.three.manufacturer;

import com.kodilla.good.patterns.challenges.three.Order;
import com.kodilla.good.patterns.challenges.three.OrderDto;

public class HealthyShop extends Manufacturer {

    public HealthyShop(String localisation) {
        super(localisation);
    }

    @Override
    public OrderDto process(Order order) {

        OrderDto output = new OrderDto(order.getUser().getUserName(), order.getDesignatedDeliveryDate());
        //jezeli order date i delivery date mniej niz 2 dni roznicy, nie przyjmij, minimum 3 dni na zamowienie
        if(order.getPurchaseDate().plusDays(2).isAfter(order.getDesignatedDeliveryDate())){
            output.setFailReason("Chosen date is too soon, minimum 3 days for delivery");
        } else {
            output.setOrderConfirmed(true);
        }
        return output;
    }
}
