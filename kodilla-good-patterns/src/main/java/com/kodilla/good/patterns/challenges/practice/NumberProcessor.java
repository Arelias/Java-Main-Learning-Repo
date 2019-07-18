package com.kodilla.good.patterns.challenges.practice;

import java.util.*;

public class NumberProcessor {

    public static Set<Integer> generateNumbers(int howMany, int minNumber, int maxNumber){

        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        while(numbers.size() < howMany){
            numbers.add(random.nextInt(maxNumber-minNumber) + minNumber);
        }

        return numbers;
    }
    public static boolean compareNumbers(Set<Integer> playerNumbers, Set<Integer> generatedNumbers){

        if(playerNumbers.size() != generatedNumbers.size()){
            return false;
        }
        for(Integer number : playerNumbers){
            if(!generatedNumbers.contains(number)){
                return false;
            }
        }
        return true;
    }
    public static int countTries(Set<Integer> playerNumbers){
        int counter = 0;
        boolean check = true;

        do{
           check = !compareNumbers(playerNumbers, generateNumbers(6,1,49));
           counter++;
        }while(check);

        return counter;
    }
}

