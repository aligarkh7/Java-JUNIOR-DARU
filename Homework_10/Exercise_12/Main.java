package Homework_10.Exercise_12;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        System.out.println(fruits);
        System.out.println(fruits.isEmpty());

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Avocado");
        fruits.add("Orange");

        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
    }
}
