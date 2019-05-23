package com.java8;

import java.util.Map;
import java.util.function.BiFunction;

public class Merge {

    public static void main(String[] args) {

        //Mapper will check for longest word. The preference is the longest
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> fighters = Fighters.favoriteFighters();

        System.out.println(fighters);

        //Since Khabib Nurmagomedov is longer than Robbie Lawler, it will update the Map
        String rafa = fighters.merge("Rafa", "Khabib Nurmagomedov", mapper);

        System.out.println(fighters);

    }
}
