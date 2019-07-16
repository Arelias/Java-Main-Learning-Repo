package com.kodilla.good.patterns.challenges.two.repositories.listing;

import com.kodilla.good.patterns.challenges.two.listings.elements.Item;
import com.kodilla.good.patterns.challenges.two.listings.elements.user.User;
import com.kodilla.good.patterns.challenges.two.listings.Listing;

import java.util.List;

public interface ListingRepository {

    void createListing(User seller, Item item, int quantity);
    List<Listing> getListings(User seller);
    void deleteListing(Listing listing);

}
