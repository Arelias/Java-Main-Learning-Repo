package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightControl {

    public void findFilght(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> routes = new HashMap<>();
        routes.put("Szymany", true);
        routes.put("Stansted", false);
        routes.put("Manchester", true);
        if(!routes.containsKey(flight.arrivalAirport) || !routes.containsKey(flight.departureAirport)){
            throw new RouteNotFoundException("Route missing");
        }
        if(!routes.get(flight.arrivalAirport) || !routes.get(flight.departureAirport)){
            System.out.println("Route suspended");
        }
        else{
            System.out.println("Flight available");
        }
    }
}
