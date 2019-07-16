package com.kodilla.good.patterns.challenges.two.repositories.order;

import com.kodilla.good.patterns.challenges.two.listings.elements.user.User;
import com.kodilla.good.patterns.challenges.two.listings.Listing;

import java.time.LocalDate;

public interface OrderRepository {

    void createOrder(User buyer, Listing listing, LocalDate orderDate);
}
