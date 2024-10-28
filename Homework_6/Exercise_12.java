package Homework_6;

public class Exercise_12 {
    public static void main(String[] args) {
//        12. Дано целое число n. Напишите программу, которая возвращает двумерный массив, представляющий таблицу умножения.
//        Число n определяет размер таблицы умножения.
//        Дано:
//        n = 5;
//        Вывод:
//        [1 ,2 ,3 ,4 ,5 ]
//        [2 ,4 ,6 ,8 ,10]
//        [3 ,6 ,9 ,12,15]
//        [4 ,8 ,12,16,20]
//        [5 ,10,15,20,25]
        int n = 5;
        int[][] numbers = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                numbers[i - 1][j - 1] = i * j;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
