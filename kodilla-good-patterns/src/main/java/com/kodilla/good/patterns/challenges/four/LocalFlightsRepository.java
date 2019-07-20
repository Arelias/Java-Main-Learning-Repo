package com.kodilla.good.patterns.challenges.four;

import javax.naming.SizeLimitExceededException;
import java.util.HashSet;
import java.util.List;

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
