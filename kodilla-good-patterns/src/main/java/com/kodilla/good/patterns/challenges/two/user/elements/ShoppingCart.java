package com.kodilla.good.patterns.challenges.two.user.elements;

import com.kodilla.good.patterns.challenges.two.listings.Listing;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Listing, Integer> listingList;

    public ShoppingCart(){

        this.listingList = new HashMap<>();
    }

    public Map<Listing, Integer> getListingList() {
        return listingList;
    }

    public double shoppingCartValue(){

        double output = 0;
        for(Listing listing : listingList.keySet()){
            output += listingList.get(listing.getQuantity()) * listing.getItem().getValue();
        }
        return output;
    }

    public void addListing(Listing listing, int amount){
        this.listingList.compute(listing, (key, value) -> value == null ? amount : value + amount);
    }

    public void removeListing(Listing listing, int amount){
        if(listingList.keySet().contains(listing)){
            if(listingList.get(listing) < amount){
                listingList.remove(listing);
            } else {
                listingList.put(listing, listingList.get(listing) - amount);
            }
        }
    }
}
