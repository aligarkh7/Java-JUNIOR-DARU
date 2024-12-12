package Homework_10.Exercise_14;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(10,"ten");
        map.put(20,"twenty");
        map.put(50,"fifty");

        System.out.println(map.containsValue("fifty"));
    }
}
