package com.kodilla.good.patterns.challenges.three;

import java.time.LocalDate;

public class OrderDto {

    private boolean orderConfirmed = false;
    private String failReason = "";
    private String userName;
    private LocalDate arrivalDate;

    public OrderDto(String userName, LocalDate arrivalDate) {
        this.userName = userName;
        this.arrivalDate = arrivalDate;
    }

    public boolean isOrderConfirmed() {
        return orderConfirmed;
    }

    public void setOrderConfirmed(boolean orderConfirmed) {
        this.orderConfirmed = orderConfirmed;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public String toString() {
        String output = "";
        output += "OrderDto{" +
                "orderConfirmed=" + orderConfirmed +
                ", userName='" + userName + '\'';
        if (!orderConfirmed) {
            output += ", failure reason= " + failReason;

        } else {
            output += ", arrivalDate='" + arrivalDate + '\'' +
                    '}';
        }

        return output;
    }
}
