package com.kodilla.good.patterns.challenges.two.repositories.listing;

import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.listings.elements.Item;
import com.kodilla.good.patterns.challenges.two.listings.elements.user.User;

import java.util.List;

public class ListingRepositorySQL implements ListingRepository {
    @Override
    public void createListing(User seller, Item item, int quantity) {

    }

    @Override
    public List<Listing> getListings(User seller) {
        return null;
    }

    @Override
    public void deleteListing(Listing listing) {

    }
}
