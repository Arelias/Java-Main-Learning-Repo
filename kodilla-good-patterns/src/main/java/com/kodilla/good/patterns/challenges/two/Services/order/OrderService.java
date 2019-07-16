package com.kodilla.good.patterns.challenges.two.Services.order;

import com.kodilla.good.patterns.challenges.two.Services.Transport.TransportService;
import com.kodilla.good.patterns.challenges.two.Services.payment.PaymentService;
import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.user.User;

public class OrderService {

    //To musi wykonywac sie w jakiejs wiekszej funkcji, ktora dziala na calym shopping cart(?)
    public boolean order(final User buyer,
                         final Listing listing,
                         final PaymentService paymentService,
                         final TransportService transportService){

        boolean orderValid = false;

        if(paymentService.pay() && transportService.request()){
            orderValid = true;
            System.out.println("Order successful.");
        }
        return orderValid;
    }

}
