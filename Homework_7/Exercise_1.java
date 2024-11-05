package Homework_7;

public class Exercise_1 {
    public static void main(String[] args) {
//        1. Напишите метод для нахождения наименьшего числа среди трех чисел.
//        Дано:
//        Первое число: 25
//        Второе число: 37
//        Третье число: 29
//        Ожидаемый результат:
//        Наименьшее значение: 25

        int[] arr = {
                25, 37, 29
        };

        System.out.println("Наименьшее значение: " + findMin(arr));
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int number : arr) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }
}
