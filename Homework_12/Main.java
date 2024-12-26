package Homework_12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1) Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел
        int a = 2, b = 3;
        System.out.println("a+b=" + (a + b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));

//        2) Напишите программу для вывода нечетных чисел от 1 до 20
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

//        3) Напишите программу, чтобы поменять местами две переменные
        int x = 3;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

//        4) Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        System.out.println(Math.max(a1, Math.max(a2, a3)));

//        5) Напишите программу для проверки того, является ли число положительным или отрицательным
        int number = -1;

        System.out.println(
                (number < 0)
                        ? number + " Отрицательное число"
                        : number + " Положительное число");

//        6) Напишите программу для замены всех символов 'a' на символы 'b'
        String str = "Hello World! I am learning Java";
        System.out.println(str.replace("a", "b"));

//        7) Напишите программу для суммирования значений массива
        int[] numbers = {
                9, 8, 7, 6, 5, 4, 3, 2, 1, 10
        };
        int res = 0;
        for (int num : numbers) {
            res += num;
        }
        System.out.println(res);

//        8) Напишите программу для нахождения второго по величине числа из массива
        int[] numbers2 = {
                10, 20, 4, 45, 98, 99, 99, 20
        };
        for (int num : numbers2) {
            System.out.print(num + " ");
        }

        int max = numbers2[0];
        int secondMax = numbers2[0];
        for (int num : numbers2) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println();
        System.out.println(secondMax);

    }
}
