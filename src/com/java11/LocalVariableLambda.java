package com.java11;

import com.java8.Fighter;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LocalVariableLambda {

    public static void main(String[] args) {

        //Java SE 10 makes implicit typing available for local variables:

        Fighter fighter = new Fighter("Mayweather", 41);

        var implicitFighter = new Fighter("Implicit Mayweather", 41);

        //For uniformity with local variables, we wish to allow 'var' for the formal
        // parameters of an implicitly typed lambda expression:
        BiPredicate<String, String> pred = (x, y) -> x.equals(y);

        BiPredicate<String, String> predVar = (var x, var y) -> x.equals(y);

        boolean equalString = pred.test("Rafael", "Rafael");

        System.out.println(equalString);

        System.out.println(predVar.test("Rafael", "Rafael"));
    }
}
