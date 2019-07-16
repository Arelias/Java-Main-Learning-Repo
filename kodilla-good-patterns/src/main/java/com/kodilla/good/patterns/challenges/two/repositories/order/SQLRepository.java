package com.kodilla.good.patterns.challenges.two.repositories.order;

import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.user.User;

import java.time.LocalDate;

public class SQLRepository implements OrderRepository {
    @Override
    public void createOrder(User buyer, Listing listing, LocalDate orderDate) {

    }
}
