package com.kodilla.good.patterns.challenges.four;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {


    //Flights from
    public Set<Flight> listDepartureFlights(FlightRepository flightRepository, String originCity){
        Set<Flight> output = flightRepository.getFlightSet().stream()
                .filter(flight -> flight.getOriginCity().equals(originCity))
                .collect(Collectors.toSet());

        return output;
    }

    //Flights to
    public Set<Flight> listArrivalFlights(FlightRepository flightRepository,String destinationCity){
        Set<Flight> output = flightRepository.getFlightSet().stream()
                .filter(flight -> flight.getDestinationCity().equals(destinationCity))
                .collect(Collectors.toSet());

        return output;
    }
    //Possible flights
    public Map<Flight, Set<Flight>> listPossibleFlights(FlightRepository flightRepository, String originCity, String destinationCity){

        if(originCity.equals(destinationCity)){
            return null;
        }

        Set<Flight> flightsFrom = listDepartureFlights(flightRepository,originCity);
        Set<Flight> flightsTo = listArrivalFlights(flightRepository, destinationCity);
        Map<Flight, Set<Flight>> connections = new HashMap<>();

        for(Flight flightFrom : flightsFrom){

            Set<Flight> possibleFlightsTo = new HashSet<>();
            if(flightFrom.getDestinationCity().equals(destinationCity)){
                possibleFlightsTo.add(flightFrom);
                connections.put(flightFrom,possibleFlightsTo);
                flightsTo.remove(flightFrom);

            } else {

                for(Flight flightTo : flightsTo){
                    if(flightFrom.getDestinationCity().equals(flightTo.getOriginCity())){
                        possibleFlightsTo.add(flightTo);
                    }
                }
                if(possibleFlightsTo.size() > 0){
                    connections.put(flightFrom, possibleFlightsTo);
                }
            }
        }

        return connections;
    }
}
