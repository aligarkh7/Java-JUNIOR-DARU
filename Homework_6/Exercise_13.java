package Homework_6;

public class Exercise_13 {
    public static void main(String[] args) {
//        13. Напишите программу, которая возвращает максимальное и минимальное значение, найденные в двумерном массиве.
//        Дано:
//        10 20 30
//        40 50 60
//        Вывод:
//        Максимальный элемент = 60
//        Минимальный элемент = 10

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };
        int min = numbers[0][0], max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (min > numbers[i][j]) {
                    min = numbers[i][j];
                }

                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
        }

        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
}
