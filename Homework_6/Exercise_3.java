package Homework_6;

public class Exercise_3 {
    public static void main(String[] args) {

//        3. Дан массив целых значений. Напишите программу для проверки, содержит ли массив определенное значение.
//        1)
//        Дано:
//        [1, 3, -6, 23, 14, 2]
//        int x = 23
//        Вывод:
//        True
//
//        2)
//        Дано:
//        [1, 3, -6, 23, 14, 2]
//        int x = 0
//        Вывод:
//        False
        int[] numbers = {1, 3, -6, 23, 14, 2};
        int x = 23; // x = 0 || x = 23
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(true);
                break;
            } else if (i == numbers.length - 1) {
                System.out.println(false);
            }
        }
    }
}
