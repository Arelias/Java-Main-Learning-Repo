package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class MovieProcessor {

    public void execute(Map<String, List<String>> items){
        items.entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .map(movie -> movie + " ! ")
                .forEach(System.out::print);
        System.out.println();
    }
}