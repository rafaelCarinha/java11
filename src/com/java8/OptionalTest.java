package com.java8;

import java.util.*;
import java.util.function.DoubleSupplier;

public class OptionalTest {

    public static void main(String[] args) throws Exception{

        //int[] numbers = {90, 80, 75, 100};

        int[] numbers = {};

        Optional<Double> average = Optional.of(Arrays.stream(numbers).average().orElse(Double.NaN));
        System.out.println("Average: "+ average.get());

        List<Duck> ducks = Duck.ducksBuilder();

        OptionalInt optionalInt = ducks.stream()
                .mapToInt(duck -> duck.getAge())
                .max();

        System.out.println("Max duck age: "+optionalInt.orElse(0));

        Optional<Duck> optionalDuck = ducks.stream().filter(duck -> duck.getAge() >3).findFirst();

        System.out.println("Duck filter: "+optionalDuck.orElseThrow(() -> new Exception("At least 1 duck was expected!")));



    }
}
