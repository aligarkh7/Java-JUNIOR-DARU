package Homework_6;

public class Exercise_7 {
    public static void main(String[] args) {
//        7. Дан массив целых значений. Напишите программу для нахождения наименьшего и второго наименьшего элементов заданного массива.
//        Дано:
//        [1, 3, -6, 23, 14, 2]
//        Вывод:
//        Наименьший элемент = -6
//        Второй наименьший элемент = 1

        int[] numbers = {1, 3, -6, 23, 14, 2};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] = numbers[j] + numbers[j + 1];
                    numbers[j + 1] = numbers[j] - numbers[j + 1];
                    numbers[j] = numbers[j] - numbers[j + 1];
                }
            }
        }
        System.out.println("Наименьший элемент = " + numbers[0]);
        System.out.println("Второй наименьший элемент = " + numbers[1]);
    }
}
