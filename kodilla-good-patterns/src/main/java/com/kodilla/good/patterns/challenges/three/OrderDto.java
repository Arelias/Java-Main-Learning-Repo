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

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
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
