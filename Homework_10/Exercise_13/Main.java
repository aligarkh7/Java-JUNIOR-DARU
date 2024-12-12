package Homework_10.Exercise_13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(10,"ten");
        map.put(20,"twenty");
        map.put(50,"fifty");

        HashMap<Integer,String> mapCopy = new HashMap<>();

        mapCopy.putAll(map);

        System.out.println(mapCopy);
    }
}
