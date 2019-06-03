package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        //create int objects from 1 to max (limited by .limit)
        //they are crated through iteration n+1
        //then we filter each object with statement n%2 == 0
        //if true, we pass it further, if not it get rejected
        //at end we printout each object
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}