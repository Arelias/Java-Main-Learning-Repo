package com.kodilla.good.patterns.challenges.four;

import java.util.List;
import java.util.Set;

public abstract class FlightRepository {

    protected Set<Flight> flightSet;

    public Set<Flight> getFlightSet() {
        return flightSet;
    }

    public abstract boolean addFlight(List<String> flightCourse);

}
