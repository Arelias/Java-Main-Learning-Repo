package com.kodilla.good.patterns.challenges.four;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

    public Set<Flight> listDepartureFlights(FlightRepository flightRepository, String departureCity){
        Set<Flight> output = flightRepository.getFlightSet().stream()
                .filter(flight -> flight.getCourse().get(0).equals(departureCity))
                .collect(Collectors.toSet());

        return output;
    }

    //loty ktore leca do
    public Set<Flight> listArrivalFlights(FlightRepository flightRepository,String arrivalCity){
        Set<Flight> output = flightRepository.getFlightSet().stream()
                .filter(flight -> flight.getCourse().get(flight.getCourse().size()-1).equals(arrivalCity))
                .collect(Collectors.toSet());

        return output;
    }
    //loty z przesiadka
    public Set<Flight> listPossibleFlights(FlightRepository flightRepository,String departureCity, String destinationCity){
        Set<Flight> output = flightRepository.getFlightSet().stream()
                .filter(flight ->
                        flight.getCourse().get(flight.getCourse().size()-1).equals(destinationCity) &&
                                flight.getCourse().get(0).equals(departureCity))
                .collect(Collectors.toSet());

        return output;
    }
}
