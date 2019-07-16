package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.two.OrderDto;
import com.kodilla.good.patterns.challenges.two.OrderProcessor;
import com.kodilla.good.patterns.challenges.two.Services.Transport.CourierService;
import com.kodilla.good.patterns.challenges.two.Services.information.MailService;
import com.kodilla.good.patterns.challenges.two.Services.order.OrderService;
import com.kodilla.good.patterns.challenges.two.Services.payment.CardService;
import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.listings.StandardListing;
import com.kodilla.good.patterns.challenges.two.listings.elements.Item;
import com.kodilla.good.patterns.challenges.two.repositories.order.SQLRepository;
import com.kodilla.good.patterns.challenges.two.request.OrderRequest;
import com.kodilla.good.patterns.challenges.two.request.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.two.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderService(), new SQLRepository(), new CardService(), new CourierService());
        OrderDto orderDto = orderProcessor.process(orderRequest.getBuyer(),orderRequest.getListing(), orderRequest.getPurchaseDate());
        System.out.println(orderDto);

    }
}
//Pierwsze zadanie
//        MovieStore movieStore = new MovieStore();
//        MovieProcessor movieProcessor = new MovieProcessor();
//        Map<String, List<String>> test = movieStore.getMovies();
//        movieProcessor.execute(test);