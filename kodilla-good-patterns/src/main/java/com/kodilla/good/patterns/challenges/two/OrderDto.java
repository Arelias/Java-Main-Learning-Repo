package com.kodilla.good.patterns.challenges.two;

import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.user.User;

public class OrderDto {


    User buyer;
    Listing listing;
    boolean isOrdered;

    public OrderDto(User buyer, Listing listing, boolean isOrdered) {
        this.buyer = buyer;
        this.listing = listing;
        this.isOrdered = isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "buyer=" + buyer +
                ", listing=" + listing.toString() +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
