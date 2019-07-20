package com.kodilla.good.patterns.challenges.four;

import java.util.HashSet;

public class LocalFlightsRepository extends FlightRepository{

    public LocalFlightsRepository() {
        this.flightSet = new HashSet<>();
    }

    @Override
    public boolean addFlight(Flight flight) {
        try{
            flightSet.add(flight);
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}
