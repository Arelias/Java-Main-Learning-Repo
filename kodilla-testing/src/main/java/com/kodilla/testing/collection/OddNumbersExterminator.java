package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OddNumbersExterminator {

   public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
       ArrayList<Integer> output = new ArrayList<>();

       for (Integer number : numbers){
           if(number % 2 == 0)
               output.add(number);
       }
       return output;
   }
}
