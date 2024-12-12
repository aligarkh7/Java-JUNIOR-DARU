package Homework_10.Exercise_11;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> firstSet = new HashSet<>();
        firstSet.add("Apple");
        firstSet.add("Banana");
        firstSet.add("Avocado");
        firstSet.add("Orange");
        System.out.println(firstSet);

        HashSet<String> secondSet = new HashSet<>();
        secondSet.add("Apple");
        secondSet.add("Banana");
        secondSet.add("Qwerty");
        secondSet.add("Yellow");
        System.out.println(secondSet);

        HashSet<String> result = new HashSet<>(firstSet);

        result.retainAll(secondSet);

        System.out.println(result);

    }
}
