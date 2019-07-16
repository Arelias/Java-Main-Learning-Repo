package com.kodilla.good.patterns.challenges.two;

import com.kodilla.good.patterns.challenges.two.Services.order.OrderService;
import com.kodilla.good.patterns.challenges.two.Services.Transport.TransportService;
import com.kodilla.good.patterns.challenges.two.Services.information.InformationService;
import com.kodilla.good.patterns.challenges.two.Services.payment.PaymentService;
import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.repositories.order.OrderRepository;
import com.kodilla.good.patterns.challenges.two.user.User;

import java.time.LocalDate;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private PaymentService paymentService;
    private TransportService transportService;
    private OrderRepository orderRepository;


    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository,
                          final PaymentService paymentService,
                          final TransportService transportService){

        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.paymentService = paymentService;
        this.transportService = transportService;

    }

    public OrderDto process(final User buyer,
                            final Listing listing,
                            final LocalDate purchaseDate){

        //Kupienie itemu to:
        //Wybranie aukcji, to mamy w parametrze, mamy tez usera
        //

        boolean isOrdered = orderService.order(buyer, listing, paymentService, transportService);
        if(isOrdered) {
            informationService.inform(buyer, listing.getSeller());
            orderRepository.createOrder(buyer, listing, purchaseDate);
        }
        return new OrderDto(buyer, listing, isOrdered);
    }

}