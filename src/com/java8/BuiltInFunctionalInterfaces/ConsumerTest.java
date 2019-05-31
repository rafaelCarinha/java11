package com.java8.BuiltInFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        //Use Consumer/BiConsumer when you want to do something with a parameter, but not return anything

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Rafael");
        c2.accept("Marins");
    }
}
