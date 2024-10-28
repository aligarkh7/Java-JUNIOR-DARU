package Homework_6;

public class Exercise_2 {
    public static void main(String[] args) {

//        2. Дан массив целых значений. Напишите программу для поиска дубликатов значений.
//        Дано:
//        [1, 3, 4, 1, 5, 5]
//        Вывод:
//        Дубликаты = 1, 5
        int[] numbers = {1, 3, 4, 1, 5, 5};
        System.out.print("Дубликаты = ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i]);
                    if (j != numbers.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }
    }
}
