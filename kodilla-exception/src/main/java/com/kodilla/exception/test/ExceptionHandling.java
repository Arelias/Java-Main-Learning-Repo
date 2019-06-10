package com.kodilla.exception.test;


public class ExceptionHandling {
    public static void main(String args[]){

        SecondChallenge challengeObject = new SecondChallenge();
        try{
            System.out.println(challengeObject.probablyIWillThrowException(1, 0));
            System.out.println(challengeObject.probablyIWillThrowException(2, 1.5));

        }
        catch (Exception e){
            System.out.println("Arguments have wrong values, " + e);
        }
        finally {
            System.out.println("Done handling exception");
        }

    }
}
