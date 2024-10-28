package Homework_6;

public class Exercise_8 {
    public static void main(String[] args) {
//        8. Дан массив целых значений. Напишите программу для формирования наибольшего числа из заданного массива целых неотрицательных чисел.
//        Дано:
//        [1, 2, 3, 0, 4, 6]
//        Вывод:
//        643210
        int[] numbers = {1, 2, 3, 0, 4, 6};
        int maxValue = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    numbers[j] = numbers[j] + numbers[j + 1];
                    numbers[j + 1] = numbers[j] - numbers[j + 1];
                    numbers[j] = numbers[j] - numbers[j + 1];
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            maxValue += (int) (Math.pow(10, numbers.length - i - 1) * numbers[i]);
        }
        System.out.println(maxValue);

    }
}
