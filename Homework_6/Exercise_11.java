package Homework_6;

public class Exercise_11 {
    public static void main(String[] args) {
//        11. Напишите программу, которая возвращает true, если двумерный массив является квадратным.
//        (!) Двумерный массив считается квадратным, если количество строк равно длине каждой строки.
//        Можно предположить, что каждая строка двумерного массива имеет одинаковое количество индексов.
//        1)
//        Дано:
//        10 20 30
//        40 50 60
//        Вывод:
//        false

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };
        boolean result = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers.length != numbers[i].length){
                result = false;
                break;
            } else if (i == numbers.length - 1) {
                result = true;
            }
        }

        System.out.println(result);

//        2)
//        Дано:
//        10 20
//        40 50
//        Вывод:
//        true

        int[][] numbers2 = {
                {10, 20},
                {40, 50}
        };
        boolean result2 = false;

        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2.length != numbers2[i].length){
                result2 = false;
                break;
            } else if (i == numbers2.length - 1) {
                result2 = true;
            }
        }

        System.out.println(result2);
    }
}
