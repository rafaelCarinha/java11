package com.java8;

import java.util.Map;

public class MapOf {

    public static void main(String[] args) {

        Map<Integer, Fighter> fighters = Map.of(
                1, new Fighter("Robbie Lawler", 37),
                2, new Fighter("Cris Cyborg", 32),
                3, new Fighter("Connor McGreggor", 30)
        );

        fighters.entrySet().stream()
                .map(entry -> new Object(){
                    long id = entry.getKey();
                    String name = entry.getValue().getName();
                    Integer age = entry.getValue().getAge();
                })
                .forEach(tuple -> System.out.println(tuple.id+" - "+ tuple.name+" - "+tuple.age));

    }
}
