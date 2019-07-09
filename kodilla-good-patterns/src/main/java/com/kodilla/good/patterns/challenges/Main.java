package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        MovieProcessor movieProcessor = new MovieProcessor();
        Map<String, List<String>> test = movieStore.getMovies();
        movieProcessor.execute(test);

    }
}
