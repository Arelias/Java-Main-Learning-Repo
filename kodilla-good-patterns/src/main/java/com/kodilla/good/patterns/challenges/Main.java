package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.three.manufacturer.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.three.manufacturer.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.three.manufacturer.HealthyShop;
import com.kodilla.good.patterns.challenges.three.Product;
import com.kodilla.good.patterns.challenges.three.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        User user = new User("Stachu", "Europe");
        Map<Product, Integer> dummyCart = new HashMap<>();
        Product salad = new Product(15, "Salatka", "Zdrowa salatka");
        Product potato = new Product(1, "Ziemniak", "Non GMO ziemniak");
        dummyCart.put(salad, 3);
        dummyCart.put(potato, 2);
        user.order(new HealthyShop("America"),dummyCart, LocalDate.now());
        user.order(new HealthyShop("America"),dummyCart, LocalDate.now().plusDays(5));
        user.order(new GlutenFreeShop("America"),dummyCart, LocalDate.now());
        dummyCart.put(salad, 10);
        user.order(new GlutenFreeShop("America"),dummyCart, LocalDate.now().plusDays(5));
        user.order(new ExtraFoodShop("America"),dummyCart, LocalDate.now());
        user.order(new ExtraFoodShop("Europe"),dummyCart, LocalDate.now().plusDays(5));

    }
}


//Zadanie mentora
//Zwracanie 6 losowych liczb od 1 do 49
//

//Celem zadania jest napisanie odpowiednich metod, aby sprawdzić ile losowań powinno się odbyć aby użytkownik trafił sześć liczb z sześciu wylosowanych.
//Liczby losowane przez komputer powinny być z zakresu 1-49. Liczby użytkownika mogą być wprowadzone ręcznie w kodzie, wprowadzone przez Scanner bądź wylosowane.
//        long sum = 0;
//
//        for(int i = 0; i < 10; i++){
//            Set<Integer> playerNumbers = NumberProcessor.generateNumbers(6,1,49);
//            sum += NumberProcessor.countTries(playerNumbers);
//            System.out.println(sum);
//        }
//        System.out.println((double)(sum/10));
//Pierwsze zadanie
//        MovieStore movieStore = new MovieStore();
//        MovieProcessor movieProcessor = new MovieProcessor();
//        Map<String, List<String>> test = movieStore.getMovies();
//        movieProcessor.execute(test);

//Drugie zadanie
//        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
//        OrderRequest orderRequest = orderRequestRetriever.retrieve();
//
//        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderService(), new OrderRepositorySQL(), new CardService(), new CourierService());
//        OrderDto orderDto = orderProcessor.process(orderRequest.getBuyer(),orderRequest.getListing(), orderRequest.getPurchaseDate());
//        System.out.println(orderDto);