package com.java11;

import java.util.function.BiPredicate;

public class LocalVariableLambdaTest {

    public static void main(String[] args) {


        //BiPredicate<String, String> biPredTest = (var x, var y) -> x.equals(y);

        //BiPredicate<String, String> testStartWith = (var x, var y) -> x.startsWith(y);

        //Method Reference
        //BiPredicate<String, String> biPredTest = String::equals;
        //BiPredicate<String, String> testStartWith = String::startsWith;


        // Implicit Type
        String name = new String("Mark");

        var name1 = new String("Bob");

        //System.out.println(biPredTest.test(name, name1));


        //System.out.println(testStartWith.test(name, "Ma"));


/*        String bob = new String("Bob");

        var mark = new String("Mark");

        BiPredicate<String, String> biPredicate = (var x, var y) -> x.equals(y);

        BiPredicate<String, String> startsWith = String::startsWith;

        BiPredicate<String, String> startsWithIgnoreCase = String::equalsIgnoreCase;

        System.out.println(startsWithIgnoreCase.test(bob, "bo"));

        System.out.println(startsWith.test(bob, "Bo"));

        System.out.println(biPredicate.test(bob, mark));*/


        String bob = new String("Bob");

        var mark = new String("Mark");

        //BiPredicate<String, String> predTest = (String x, String y) -> x.equals(y);

        //BiPredicate<String, String> predTest = (var x, var y) -> x.startsWith(y);

        BiPredicate<String, String> predTestMF = String::startsWith;


        System.out.println(predTestMF.test(bob, "Bo"));









    }
}
