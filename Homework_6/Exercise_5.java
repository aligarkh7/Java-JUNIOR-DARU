package Homework_6;

public class Exercise_5 {
    public static void main(String[] args) {

//        5. Даны массив целых значений и целые числа n, m. Напишите программу для нахождения подмассива между индексами n и m.
//        1)
//        Дано:
//        [34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7]
//        int n = 3
//        int m = 8
//        Вывод:
//        [30, 25, 40, 32, 31, 35]

        int[] numbers = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        int[] subNumbers = new int[m - n + 1];

        if (m < numbers.length) {
            for (int i = n; i <= m; i++) {
                subNumbers[i - n] = numbers[i];
            }
        }

        for (int i = 0; i < subNumbers.length; i++) {
            if (i == 0) {
                System.out.print("[" + subNumbers[i] + ", ");
            } else if (i == subNumbers.length - 1) {
                System.out.print(subNumbers[i] + "]");
            } else {
                System.out.print(subNumbers[i] + ", ");
            }
        }

        System.out.println();

//        2)
//        Дано:
//        [1, 3, -6, 23, 14, 2]
//        int n = 1
//        int m = 3
//        Вывод:
//        [3, -6, 23]

        int[] numbers1 = {1, 3, -6, 23, 14, 2};
        n = 1;
        m = 3;
        int[] subNumbers1 = new int[m - n + 1];

        if (m < numbers1.length) {
            for (int i = n; i <= m; i++) {
                subNumbers1[i - n] = numbers1[i];
            }
        }

        for (int i = 0; i < subNumbers1.length; i++) {
            if (i == 0) {
                System.out.print("[" + subNumbers1[i] + ", ");
            } else if (i == subNumbers1.length - 1) {
                System.out.print(subNumbers1[i] + "]");
            } else {
                System.out.print(subNumbers1[i] + ", ");
            }
        }

    }
}
