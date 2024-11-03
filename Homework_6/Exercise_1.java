package Homework_6;

public class Exercise_1 {
    public static void main(String[] args) {

//        Выполните следующие инструкции:
//        1. Дан массив чисел. Напишите программу для вычисления среднего значения элементов одномерного массива.
//        Дано:
//        [1, 3, 4, 1, 5, 5]
//        Вывод:
//        Среднее значение = 3.16666667
        int[] numbers = {1, 3, 4, 1, 5, 5};
        float AVG = 0;
        for (int i = 0; i < numbers.length; i++) {
            AVG += numbers[i];
        }
        AVG /= numbers.length;

        System.out.println("Среднее значение = " + AVG);
    }
}
