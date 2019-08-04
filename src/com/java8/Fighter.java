package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fighter {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Fighter(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static Map<String, String> favoriteFighters(){

        Map<String, String> favoriteFighters = new HashMap<>();
        favoriteFighters.put("Rafa", "Robbie Lawler");
        favoriteFighters.put("Vivian", "Cris Cyborg");
        favoriteFighters.put("Everybody", "Connor McGreggor");

        return favoriteFighters;

    }

    public static List<Fighter> fightersBuilder(){
        List<Fighter> fighters = new ArrayList<>();
        fighters.add(new Fighter("Robbie Lawler", 37));
        fighters.add(new Fighter("Cris Cyborg", 36));
        fighters.add(new Fighter("Connor McGreggor", 31));
        return fighters;
    }

    public String toString() {
        return this.name + ": "+this.age;
    }
}
