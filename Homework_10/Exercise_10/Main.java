package Homework_10.Exercise_10;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.add("G");

        System.out.println(linkedList);

        int firstIndex = 0;
        int secondIndex = 1;

        String temp = linkedList.get(firstIndex);
        linkedList.set(firstIndex, linkedList.get(secondIndex));
        linkedList.set(secondIndex,temp);

        System.out.println(linkedList);
    }
}
