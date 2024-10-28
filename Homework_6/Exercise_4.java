package Homework_6;

public class Exercise_4 {
    public static void main(String[] args) {
//        4. Дан массив целых значений. Напишите программу для нахождения индекса элемента массива.
//        1)
//        Дано:
//        [1, 3, -6, 23, 14, 2]
//        int x = 23
//        Вывод:
//        Индекс = 3
//
//        2)
//        Дано:
//        [1, 3, -6, 23, 14, 2]
//        int x = 5
//        Вывод:
//        Не найдено

        int[] numbers = {1, 3, -6, 23, 14, 2};
        int x = 5;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Индекс = " + i);
                break;
            } else if (i == numbers.length - 1) {
                System.out.println("Не найдено");
            }
        }
    }
}
