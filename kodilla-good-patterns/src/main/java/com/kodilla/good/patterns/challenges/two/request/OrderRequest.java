package com.kodilla.good.patterns.challenges.two.request;
import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.user.User;

import java.time.LocalDate;


public class OrderRequest {

    final User buyer;
    final Listing listing;
    final LocalDate purchaseDate;


    public OrderRequest(User buyer, Listing listing, LocalDate purchaseDate) {
        this.buyer = buyer;
        this.listing = listing;
        this.purchaseDate = purchaseDate;
    }

    public User getBuyer() {
        return buyer;
    }

    public Listing getListing() {
        return listing;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
}
