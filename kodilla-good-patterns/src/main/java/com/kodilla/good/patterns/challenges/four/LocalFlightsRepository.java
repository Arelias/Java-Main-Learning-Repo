package com.kodilla.good.patterns.challenges.four;

import javax.naming.SizeLimitExceededException;
import java.util.HashSet;
import java.util.List;

public class LocalFlightsRepository extends FlightRepository{

    public LocalFlightsRepository() {
        this.flightSet = new HashSet<>();
    }

    @Override
    public boolean addFlight(List<String> flightCourse) {
        try{
            if(flightCourse.size() > 3 || flightCourse.size() < 2){
                throw new SizeLimitExceededException();
            }

            Flight flight = new Flight(flightCourse);
            flightSet.add(flight);
            return true;

        } catch (Exception e) {
            System.out.println("Flight course is incorrect");
            e.printStackTrace();
            return false;
        }
    }
}
