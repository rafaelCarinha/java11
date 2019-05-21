package com.comparator;

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
}
