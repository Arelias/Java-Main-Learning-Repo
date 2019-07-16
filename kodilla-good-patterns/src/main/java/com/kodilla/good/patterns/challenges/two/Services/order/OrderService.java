package com.kodilla.good.patterns.challenges.two.Services.order;

import com.kodilla.good.patterns.challenges.two.Services.Transport.TransportService;
import com.kodilla.good.patterns.challenges.two.Services.payment.PaymentService;
import com.kodilla.good.patterns.challenges.two.listings.BiddingListing;
import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.listings.elements.user.User;

import java.time.LocalDateTime;

public class OrderService {

    //To musi wykonywac sie w jakiejs wiekszej funkcji, ktora dziala na calym shopping cart(?)
    public boolean order(final User buyer,
                         final Listing listing,
                         final PaymentService paymentService,
                         final TransportService transportService){

        boolean orderValid = paymentService.pay() && transportService.request();

        if(listing instanceof BiddingListing)
        {
            orderValid = orderValid && (LocalDateTime.now().isAfter(listing.getEndDate()));
        }

        if(orderValid){
            System.out.println("Order successful.");
        }
        return orderValid;
    }

}
