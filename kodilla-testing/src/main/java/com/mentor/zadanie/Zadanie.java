package com.mentor.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie {


    public int showDuplicates(ArrayList<Integer> inputList){

        int n = inputList.size()-1;
        int expectedSum = (n*(n+1))/2;
        int sum = 0;

        for(int i = 0; i < inputList.size(); i++){
            sum += inputList.get(i);
        }
        System.out.println("expected: " + expectedSum);
        System.out.println("real sum: " + sum);

        return sum - expectedSum;
    }


}