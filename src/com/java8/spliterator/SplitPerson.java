package com.java8.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SplitPerson {

    public static void main(String[] args) {

        try {
            Stream<String> lines = Files.lines(new SplitPerson().read("PersonFile.txt"));

            //lines.forEach(System.out::println);

            Spliterator<String> lineSpliterator = lines.spliterator();

            Spliterator<Person> peopleSpliterator = new PersonSpliterator(lineSpliterator);

            Stream<Person> people = StreamSupport.stream(peopleSpliterator, false);

            people.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    Path read(String filePath) throws Exception{

        return Paths.get(getClass().getClassLoader()
                .getResource(filePath).toURI());
    }
}
