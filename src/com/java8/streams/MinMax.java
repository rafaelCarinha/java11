package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMax {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Monkey", "123", "Chimp");

        Optional<String> min = list.stream().min((s1, s2) -> s1.length()-s2.length());

        //Using method reference
        Optional<String> min1 = list.stream().min(Comparator.comparing(String::length));

        //Prints the smallest value from the list
        min.ifPresent(System.out::println);
        min1.ifPresent(System.out::println);

    }
}
