package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.four.Flight;
import com.kodilla.good.patterns.challenges.four.FlightRepository;
import com.kodilla.good.patterns.challenges.four.FlightSearcher;
import com.kodilla.good.patterns.challenges.four.LocalFlightsRepository;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        FlightRepository flightRepo = new LocalFlightsRepository();
        FlightSearcher flightSearcher = new FlightSearcher();
        flightRepo.addFlight(new Flight("Krakow", "Olsztyn"));
        flightRepo.addFlight(new Flight("Wroclaw", "Olsztyn"));
        flightRepo.addFlight(new Flight("Warszawa", "Krakow"));
        flightRepo.addFlight(new Flight("Stansted", "Gdansk"));
        flightRepo.addFlight(new Flight("Olsztyn", "Krakow"));
        flightRepo.addFlight(new Flight("Olsztyn", "Krakow"));
        flightRepo.addFlight(new Flight("Olsztyn", "Wroclaw"));
        flightRepo.addFlight(new Flight("Wroclaw", "Krakow"));
        flightRepo.addFlight(new Flight("Gdansk", "Olsztyn"));




        System.out.println("Flights arriving in: ");
        System.out.println("---------------------------------------");
        System.out.println(flightSearcher.listArrivalFlights(flightRepo, "Krakow"));
        System.out.println(flightSearcher.listArrivalFlights(flightRepo, "Olsztyn"));
        System.out.println(flightSearcher.listArrivalFlights(flightRepo, "Gdansk"));
        System.out.println("---------------------------------------");

        System.out.println("Flights departing to: ");
        System.out.println("---------------------------------------");
        System.out.println(flightSearcher.listDepartureFlights(flightRepo, "Krakow"));
        System.out.println(flightSearcher.listDepartureFlights(flightRepo, "Olsztyn"));
        System.out.println(flightSearcher.listDepartureFlights(flightRepo, "Wroclaw"));
        System.out.println("---------------------------------------");

        System.out.println("Flight between cities A and B: ");
        System.out.println("---------------------------------------");
        System.out.println("1" + flightSearcher.listPossibleFlights(flightRepo, "Wroclaw", "Krakow"));
        System.out.println("2" + flightSearcher.listPossibleFlights(flightRepo, "Olsztyn", "Krakow"));
        System.out.println("3" + flightSearcher.listPossibleFlights(flightRepo, "Stansted", "Olsztyn"));
        System.out.println("4" + flightSearcher.listPossibleFlights(flightRepo, "Krakow", "Wroclaw"));
        System.out.println("---------------------------------------");

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

//Trzecie zadanie
//        User user = new User("Stachu", "Europe");
//        Map<Product, Integer> dummyCart = new HashMap<>();
//        Product salad = new Product(15, "Salatka", "Zdrowa salatka");
//        Product potato = new Product(1, "Ziemniak", "Non GMO ziemniak");
//        dummyCart.put(salad, 3);
//        dummyCart.put(potato, 2);
//        user.order(new HealthyShop("America"),dummyCart, LocalDate.now());
//        user.order(new HealthyShop("America"),dummyCart, LocalDate.now().plusDays(5));
//        user.order(new GlutenFreeShop("America"),dummyCart, LocalDate.now());
//        dummyCart.put(salad, 10);
//        user.order(new GlutenFreeShop("America"),dummyCart, LocalDate.now().plusDays(5));
//        user.order(new ExtraFoodShop("America"),dummyCart, LocalDate.now());
//        user.order(new ExtraFoodShop("Europe"),dummyCart, LocalDate.now().plusDays(5));