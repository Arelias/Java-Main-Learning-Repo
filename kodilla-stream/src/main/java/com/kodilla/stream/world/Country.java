package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleQuantity;

    public Country(BigDecimal peopleQuantity){
        this.peopleQuantity = peopleQuantity;
    }
    BigDecimal getPeopleQuantity(){
        return this.peopleQuantity;
    }
}
