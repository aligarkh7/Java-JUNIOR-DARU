package Homework_10.Exercise_10;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        linkedList.add("g");

        System.out.println(linkedList);

        linkedList.set(1,"B");

        System.out.println(linkedList);

        linkedList.set(3,"DD");

        System.out.println(linkedList);
    }
}
