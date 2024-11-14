package Homework_7;

public class Exercise_5 {
    public static void main(String[] args) {
//        5. Дано целое неотрицательное число. Напишите метод для подсчета количества цифр числа, имеющих значение 2.
//        Дано:
//        1254212
//        Ожидаемый результат:
//        3

        int number = 1254212;

        System.out.println(countingTheNumberOfNumbers(number, 2));
    }

    private static int countingTheNumberOfNumbers(int number, int value) {
        if (number == 0) {
            return 0;
        }

        if (number % 10 == value) {
            return 1 + countingTheNumberOfNumbers(number / 10, value);
        } else {
            return countingTheNumberOfNumbers(number / 10, value);
        }
    }
}
