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
        if (numbers.length == numbers[0].length){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
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
        if (numbers2.length == numbers2[0].length){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
