package com.kodilla.exception.test;


public class ExceptionHandling {
    public static void main(String args[]){


        Flight flight1 = new Flight("Szymany", "Stansted");
        Flight flight2 = new Flight("Szymany", "Gdansk");
        FlightControl controller = new FlightControl();
        try{
            controller.findFilght(flight1);
            controller.findFilght(flight2);
        }
        catch (RouteNotFoundException e){
            System.out.println("Flight not available, " + e);
        }
        finally {
            System.out.println("Done searching for flights");
        }


    }
}
//        SecondChallenge challengeObject = new SecondChallenge();
//        try{
//            System.out.println(challengeObject.probablyIWillThrowException(1, 0));
//            System.out.println(challengeObject.probablyIWillThrowException(2, 1.5));
//
//        }
//        catch (Exception e){
//            System.out.println("Arguments have wrong values, " + e);
//        }
//        finally {
//            System.out.println("Done handling exception");
//        }