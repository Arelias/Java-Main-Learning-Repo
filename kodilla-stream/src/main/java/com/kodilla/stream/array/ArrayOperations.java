package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        double output;

        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(n));

        output = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().orElse(-1);

        return output;
    }
}
