package Homework_9.Exercise_3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Square square = new Square(scanner.nextInt());
        System.out.println(square);
    }
}
