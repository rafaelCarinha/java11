package com.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {

        List<Duck> ducks = Arrays.asList(new Duck("black", 1),
                new Duck("brown", 4),
                new Duck("white", 2));

        //Filters Ducks that colors Starts with B
        List<Duck> filteredDucks = ducks.stream()
                .filter(duck -> duck.getColor().startsWith("b"))
                .collect(Collectors.toList());

        filteredDucks.forEach(System.out::println);
    }
}
