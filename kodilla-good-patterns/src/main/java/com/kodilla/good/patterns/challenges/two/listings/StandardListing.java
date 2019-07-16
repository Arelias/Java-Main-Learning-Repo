package com.kodilla.good.patterns.challenges.two.listings;

import com.kodilla.good.patterns.challenges.two.listings.elements.Item;
import com.kodilla.good.patterns.challenges.two.user.User;

import java.time.LocalDateTime;

public class StandardListing extends Listing {

    public StandardListing(User seller, Item item, int quantity, LocalDateTime startDate, LocalDateTime endDate) {

        super(seller, item, quantity, startDate, endDate);

    }

    public boolean buyItems(int quantity) {

        boolean check = this.getQuantity() > quantity;

        if (check) {
            this.setQuantity(this.getQuantity() - quantity);
        }

        return check;
    }
}
