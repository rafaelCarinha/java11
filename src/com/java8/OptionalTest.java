package com.java8;

import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        int[] numbers = {90, 80, 75, 100};

        //int[] numbers = {};

        Optional<Double> average = Optional.of(Arrays.stream(numbers).average().orElse(Double.NaN));

        System.out.println("Average: "+ average.get());

    }
}
