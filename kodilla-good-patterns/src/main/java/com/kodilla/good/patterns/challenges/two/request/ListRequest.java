package com.kodilla.good.patterns.challenges.two.request;

import com.kodilla.good.patterns.challenges.two.listings.BiddingListing;
import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.listings.StandardListing;
import com.kodilla.good.patterns.challenges.two.listings.elements.Item;
import com.kodilla.good.patterns.challenges.two.listings.elements.user.User;
import java.time.LocalDateTime;

public class ListRequest {

    public ListRequest(User seller,
                       String listingType,
                       double itemValue,
                       String itemName,
                       String itemDescription,
                       int quantity,
                       int duration){

        Listing listing;
        Item item = new Item(itemValue,itemName, itemDescription);
        if(listingType.equals("Standard")){
            listing = new StandardListing(seller,item,quantity, LocalDateTime.now(), LocalDateTime.now().plusDays(duration));
        } else if(listingType.equals("Bidding")){
            listing = new BiddingListing(seller,item,quantity, LocalDateTime.now(), LocalDateTime.now().plusDays(duration));
        } else {
            System.out.println("This listing type is not suppoted");
        }

    }
}
