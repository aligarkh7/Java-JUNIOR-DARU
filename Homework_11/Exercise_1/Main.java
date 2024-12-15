package Homework_11.Exercise_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sqrtDouble();
    }

    private static void sqrtDouble() {
        try {
            Scanner scanner = new Scanner(System.in);
            double number = scanner.nextDouble();
            System.out.println(Math.sqrt(number));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка попробуй еще раз");
            sqrtDouble();
        }
    }
}
