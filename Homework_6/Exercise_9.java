package Homework_6;

public class Exercise_9 {
    public static void main(String[] args) {
//        9. Дан двумерный массив целых значений. Напишите программу для печати массива после изменения строк и
//        столбцов заданного двумерного массива.
//        1)
//        Дано:
//        10 20 30
//        40 50 60
//        Вывод:
//        После изменения строк и столбцов указанного массива
//        10 40
//        20 50
//        30 60

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };
        for (int i = 0; i < numbers[0].length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println();


//        2)
//        Дано:
//        4 2 1
//        2 7 2
//        Вывод:
//        После изменения строк и столбцов указанного массива
//        4 2
//        2 7
//        1 2

        int[][] numbers2 = {
                {4, 2, 1},
                {2, 7, 2}
        };
        for (int i = 0; i < numbers2[0].length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                System.out.print(numbers2[j][i] + " ");
            }
            System.out.println();
        }

    }
}
