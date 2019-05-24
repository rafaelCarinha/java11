package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ComputeIf {

    public static void main(String[] args) {

        Map<String, Integer> wins = new HashMap<>();
        wins.put("Silva", 10);
        wins.put("Aldo", 9);
        wins.put("Cyborg", 4);

        System.out.println(wins);

        Function<String, Integer> mapper = (k) -> 1;
        BiFunction<String, Integer, Integer> addsOne = (k,v) -> v+1;

        Integer max = wins.computeIfAbsent("Max", mapper);

        System.out.println(wins);

        Integer silva = wins.computeIfPresent("Silva", addsOne);

        System.out.println(wins);

    }
}
