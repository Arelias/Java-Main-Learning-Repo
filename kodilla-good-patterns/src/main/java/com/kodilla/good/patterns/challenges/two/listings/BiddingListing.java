package com.kodilla.good.patterns.challenges.two.listings;
import com.kodilla.good.patterns.challenges.two.listings.elements.Item;
import com.kodilla.good.patterns.challenges.two.listings.elements.user.User;

import java.time.LocalDateTime;

public class BiddingListing extends Listing {

    private double highestBid;
    private User highestBidder;


    public BiddingListing (User seller, Item item, int quantity, LocalDateTime startDate, LocalDateTime endDate) {

        super(seller, item, quantity, startDate, endDate);
        this.highestBid = 0;
        this.highestBidder = null;
    }

    public boolean bid(double amount, User bidder){

        boolean check = amount > this.highestBid;

        if(check){
            this.highestBid = amount;
            this.highestBidder = bidder;
        }

        return check;
    }


}
