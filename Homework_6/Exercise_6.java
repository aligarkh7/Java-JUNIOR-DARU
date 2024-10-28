package Homework_6;

public class Exercise_6 {
    public static void main(String[] args) {
//        6. Дан массив целых значений. Напишите программу для нахождения наибольшего и наименьшего элементов массива.
//        Дано:
//        [1, 3, -6, 23, 14, 2]
//        Вывод:
//        Минимальный элемент = -6
//        Максимальный элемент = 23
        int[] numbers = {1, 3, -6, 23, 14, 2};
        int min = numbers[0], max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }

            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }
}
