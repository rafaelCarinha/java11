package com.comparator;

import java.util.ArrayList;
import java.util.List;

public class Duck implements Comparable<Duck>{

    private String color;
    private int age;

    public Duck(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Duck d2) {
        return color.compareTo(d2.color);
    }

    public static List<Duck>  ducksBuilder(){
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("black", 1));
        ducks.add(new Duck("brown", 4));
        ducks.add(new Duck("white", 2));
        return ducks;
    }
}
