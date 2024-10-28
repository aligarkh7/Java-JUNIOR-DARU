package Homework_6;

public class Exercise_10 {
    public static void main(String[] args) {
//        10. Напишите программу, которая возвращает сумму всех значений в двумерном массиве.
//        Дано:
//        10 20 30
//        40 50 60
//        Вывод:
//        Сумма = 210

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
