package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyNoneAllMatch {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Monkey", "123", "Chimp");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));

        System.out.println(list.stream().allMatch(pred));

        System.out.println(list.stream().noneMatch(pred));

    }
}
