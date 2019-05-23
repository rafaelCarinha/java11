package com.java8;

import java.util.HashMap;
import java.util.Map;

public class Fighters {

    public static Map<String, String> favoriteFighters(){

        Map<String, String> favoriteFighters = new HashMap<>();
        favoriteFighters.put("Rafa", "Robbie Lawler");
        favoriteFighters.put("Vivian", "Cris Cyborg");
        favoriteFighters.put("Everybody", "Conner McGreggor");

        return favoriteFighters;

    }
}
