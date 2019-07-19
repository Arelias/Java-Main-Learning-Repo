package com.kodilla.good.patterns.challenges.three.manufacturer;

import com.kodilla.good.patterns.challenges.three.Order;
import com.kodilla.good.patterns.challenges.three.OrderDto;

public class ExtraFoodShop extends Manufacturer {

    public ExtraFoodShop(String localisation) {
        super(localisation);
    }

    @Override
    public OrderDto process(Order order) {

        OrderDto output =  new OrderDto(order.getUser().getUserName(), order.getDesignatedDeliveryDate(), order.getId());

        if(!order.getUser().getLocalisation().equals(this.localisation)){
            output.setFailReason("Your localisation is not yet supported");
        } else {
            output.setOrderConfirmed(true);
        }
        return output;
    }
}
