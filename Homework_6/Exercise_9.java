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
        int[][] modifiedArray = new int[numbers[0].length][numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                modifiedArray[j][i] = numbers[i][j];
            }
        }

        for (int i = 0; i < modifiedArray.length; i++) {
            for (int j = 0; j < modifiedArray[i].length; j++) {
                System.out.print(modifiedArray[i][j]+" ");
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
        int[][] modifiedArray2 = new int[numbers2[0].length][numbers2.length];

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                modifiedArray2[j][i] = numbers2[i][j];
            }
        }

        for (int i = 0; i < modifiedArray2.length; i++) {
            for (int j = 0; j < modifiedArray2[i].length; j++) {
                System.out.print(modifiedArray2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
