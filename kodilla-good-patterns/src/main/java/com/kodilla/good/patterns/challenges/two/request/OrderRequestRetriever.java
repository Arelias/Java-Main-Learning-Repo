package com.kodilla.good.patterns.challenges.two.request;

import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.listings.StandardListing;
import com.kodilla.good.patterns.challenges.two.listings.elements.Item;
import com.kodilla.good.patterns.challenges.two.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User buyer = new User("John Wick", "Dog1234");
        User seller = new User("Vladimir", "Putin");
        Item item = new Item(20.5, "Battery pack", "The newest batteries, now up to 50% more power");
        Listing listing = new StandardListing(seller, item, 100, LocalDateTime.now(), LocalDateTime.now().plusDays(14));

        buyer.getShoppingCart().addListing(listing, 10);

        return new OrderRequest(buyer, listing, LocalDate.now());
    }
}
