package com.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareObjects {

    public static void main(String[] args) {

        List<Duck> ducks = Arrays.asList(new Duck("black", 1),
                                         new Duck("brown", 4),
                                         new Duck("white", 2));

        Comparator<Duck> byAge = (d1, d2) -> d1.getAge()-d2.getAge();

        //Here we compare using the Comparable implementation compareTo - By Color
        Collections.sort(ducks);

        //Here we compare using the comparator by Age
        //Collections.sort(ducks, byAge);

        System.out.println(ducks);

    }
}
