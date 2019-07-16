package com.kodilla.good.patterns.challenges.one;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieProcessor {

    public void execute(Map<String, List<String>> items){
        String temp = items.entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(temp);
    }
}