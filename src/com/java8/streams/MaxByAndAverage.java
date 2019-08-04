package com.java8.streams;

import com.java8.Fighter;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByAndAverage {

    public static void main(String[] args) {

        List<Fighter> fighters =  Fighter.fightersBuilder();

        //Filter the Oldest

        Optional<Fighter> optFighter =
                fighters.stream()
                        .collect(Collectors.maxBy(Comparator.comparing(fighter -> fighter.getAge())));

        System.out.println(optFighter.get().toString());

        //Find the average Age

        double averageAge =
                fighters.stream()
                .collect(Collectors.averagingDouble(fighter -> fighter.getAge()));

        System.out.println("Average fighter age: "+ averageAge);

    }
}
