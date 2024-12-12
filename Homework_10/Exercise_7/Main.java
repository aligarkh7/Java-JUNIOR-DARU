package Homework_10.Exercise_7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("a");
        firstList.add("b");
        firstList.add("c");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("a");
        secondList.add("b");
        secondList.add("c");

        System.out.println(firstList);
        System.out.println(secondList);
        System.out.println(firstList.equals(secondList));

        firstList.add("1");

        System.out.println(firstList);
        System.out.println(secondList);
        System.out.println(firstList.equals(secondList));

        secondList.add("1");

        System.out.println(firstList);
        System.out.println(secondList);
        System.out.println(firstList.equals(secondList));
    }
}
