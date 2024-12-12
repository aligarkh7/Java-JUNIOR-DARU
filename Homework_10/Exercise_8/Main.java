package Homework_10.Exercise_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");

        System.out.println(arrayList);

        arrayList.set(1,"B");

        System.out.println(arrayList);

    }
}
