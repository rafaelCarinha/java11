package com.comparator;

import java.util.List;

public class ReplaceAll {

    public static void main(String[] args) {

        List<Duck> ducks = Duck.ducksBuilder();

        System.out.println(ducks);

        //Uses the method replaceAll, multiplying all ages by 3
        ducks.replaceAll(d -> {
            d.setAge(d.getAge()*3);
            return  d;
        });

        System.out.println(ducks);
    }
}
