package com.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIf {

    public static void main(String[] args) {

        //RemoveIf cannot be used on a List created using Array.asList, because this List would have fixed size
        /*
        List<Duck> ducks = Arrays.asList(new Duck("black", 1),
                new Duck("brown", 4),
                new Duck("white", 2));*/

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("black", 1));
        ducks.add(new Duck("brown", 4));
        ducks.add(new Duck("white", 2));

        System.out.println(ducks);

        ducks.removeIf(d -> d.getColor().startsWith("w"));

        System.out.println(ducks);
    }
}
