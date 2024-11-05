package Homework_7;

public class Exercise_8 {
    public static void main(String[] args) {
//        8. Напишите метод для вычисления суммы цифр целого числа.
//        Дано:
//        252
//        Ожидаемый результат:
//        Сумма = 9

        int number = 252;

        System.out.println(numberSum(number));
    }

    private static int numberSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
