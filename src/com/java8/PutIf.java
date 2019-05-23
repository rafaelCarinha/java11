package com.java8;

import java.util.HashMap;
import java.util.Map;

public class PutIf {

    public static void main(String[] args) {

        Map<String, String> favoriteFighters = new HashMap<>();
        favoriteFighters.put("Rafa", "Robbie Lawler");
        favoriteFighters.put("Vivian", "Cris Cyborg");
        favoriteFighters.put("Everybody", "Conner McGreggor");

        System.out.println(favoriteFighters);

        favoriteFighters.putIfAbsent("Escobar", "Nick Dias");
        //PutIfAbsent won't update here, since Rafa is present
        favoriteFighters.putIfAbsent("Rafa", "Cro Cop");

        System.out.println(favoriteFighters);
    }
}
