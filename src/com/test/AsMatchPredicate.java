package com.test;

import java.util.Arrays;
import java.util.regex.Pattern;

public class AsMatchPredicate {

    public static void main(String[] args) {

        var words = Arrays.asList("java11", "Java11", "JAVA11", "Java10");

        //Match word even if it is Upper/Lower case
        var pred = Pattern.compile("java11",
                Pattern.CASE_INSENSITIVE).asMatchPredicate();

        words.forEach((word) -> {
            //test() method checks if given word matches to original word with compiled pattern
            if (pred.test(word)) {
                System.out.printf("%s matches to original word%n", word);
            } else {
                System.out.printf("%s does not match to original word%n", word);
            }
        });
    }
}
