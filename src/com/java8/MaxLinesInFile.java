package com.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class MaxLinesInFile {

    public static void main(String[] args) throws Exception {

        MaxLinesInFile maxLinesInFile = new MaxLinesInFile();

        Stream<String> lines = Files.lines(maxLinesInFile.read("File.txt"));

        //lines.forEach(System.out::println);

        String longestLine = lines
                .max(Comparator.comparingInt(String::length))
                .get();

/*        int lengthLongestLine = lines
                .mapToInt(String::length)
                .max()
                .getAsInt();*/

        System.out.println("Longest line: " +longestLine);

        //System.out.println("Length of longest line: "+lengthLongestLine);

    }

    Path read(String filePath) throws Exception{

        return Paths.get(getClass().getClassLoader()
                .getResource(filePath).toURI());
    }

}
