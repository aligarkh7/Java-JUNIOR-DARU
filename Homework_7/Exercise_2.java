package Homework_7;

public class Exercise_2 {
    public static void main(String[] args) {
//        2. Напишите метод для вычисления среднего значения трех чисел.
//        Дано:
//        Первое число: 25
//        Второе число: 45
//        Третье число: 65
//        Ожидаемый результат:
//        Среднее значение 45,0

        int[] arr = {
                25, 45, 65
        };

        System.out.println("Среднее значение " + findAVG(arr));
    }

    private static float findAVG(int[] arr) {
        int avg = 0;
        for (int number : arr) {
            avg += number;
        }
        return (float) avg / arr.length;
    }
}
