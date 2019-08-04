package com.java8.streams;

import com.java8.Fighter;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningString {

    public static void main(String[] args) {

        List<Fighter> fighters =  Fighter.fightersBuilder();

        // return the list of names

        String fightersNames =
                fighters.stream()
                        .map(Fighter::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Fighters names: "+ fightersNames);

    }
}
