package com.java11;

import java.util.Arrays;
import java.util.List;

public class Main {

    private int x;

    void loop(){
        for(int x=0; x<3; x++){
            JILL:System.out.println();

        }
    }


    public static void main(String[] args) {

        List<String> strings = Arrays.asList("1, 2, 3");

        System.out.println(strings.stream().map(o -> o.toString()));



    }
}


