package Homework_10.Exercise_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("WHITE");
        colors.add("RED");
        colors.add("BLUE");
        colors.add("YELLOW");
        colors.add("GREEN");
        colors.add("ORANGE");
        colors.add("PINK");
        colors.add("PURPLE");
        colors.add("BROWN");
        colors.add("GREY");

        colors.forEach(color -> System.out.println(color));
    }
}
