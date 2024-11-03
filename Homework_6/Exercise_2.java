package Homework_6;

public class Exercise_2 {
    public static void main(String[] args) {

//        2. Дан массив целых значений. Напишите программу для поиска дубликатов значений.
//        Дано:
//        [1, 3, 4, 1, 5, 5]
//        Вывод:
//        Дубликаты = 1, 5
        int[] numbers = {1, 3, 4, 1, 5, 5};
        boolean bool = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (bool) { // это условие для того, чтобы выходные данные совпадали как в задачах
                        System.out.print("Дубликаты = ");
                        bool = false;
                    }
                    System.out.print(numbers[i]);
                    if (i != numbers.length - 2) {
                        System.out.print(", ");
                    }
                }
            }
        }
    }
}
