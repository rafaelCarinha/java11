package com.java8.streams;

import com.java8.spliterator.SplitPerson;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapStream {

    public static void main(String[] args) throws Exception {

        Stream<String> personFile = Files.lines(new FlatMapStream().read("PersonFile.txt"));
        Stream<String> person2File = Files.lines(new FlatMapStream().read("Person2File.txt"));
        Stream<String> person3File = Files.lines(new FlatMapStream().read("Person4File.txt"));

        Stream<String> combinedFilesLines = Stream.of(personFile, person2File, person3File)
                                                  .flatMap(Function.identity());

        combinedFilesLines.forEach(System.out::println);

    }

    Path read(String filePath) throws Exception{

        return Paths.get(getClass().getClassLoader()
                .getResource(filePath).toURI());
    }
}
