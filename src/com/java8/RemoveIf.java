package com.java8;

import java.util.List;

public class RemoveIf {

    public static void main(String[] args) {

        //RemoveIf cannot be used on a List created using Array.asList, because this List would have fixed size
        /*
        List<Duck> ducks = Arrays.asList(new Duck("black", 1),
                new Duck("brown", 4),
                new Duck("white", 2));*/


        List<Duck> ducks = Duck.ducksBuilder();

        System.out.println(ducks);

        ducks.removeIf(d -> d.getColor().startsWith("w"));

        System.out.println(ducks);
    }
}
