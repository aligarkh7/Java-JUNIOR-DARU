package Homework_4;

public class Homework4 {
    public static void main(String[] args) {
//        Напишите программу для умножения 10 на 5 и вывода результата в консоль.
        System.out.println(10 * 5);

//        Напишите программу для деления 20 на 2.5 и вывода результата в консоль.
        System.out.println(20 / 2.5);

//        Длина и ширина прямоугольника равны 15 и 9 соответственно.
//        Напишите программу для вычисления площади и периметра прямоугольника.
        int a = 15, b = 9;
        int S = a * b;
        System.out.println("S = " + S);
        int P = (a + b) * 2;
        System.out.println("P = " + P);

//        Используйте правильный оператор, чтобы увеличить значение переменной x на 1
//        с помощью префиксной и постфиксной форм. Выведите на экран результат.
        int x = 0;
        ++x;
        System.out.println(x);
        x++;
        System.out.println(x);

//        Используйте оператор присваивания сложения, чтобы добавить значение 5 к переменной x.
        x += 5;
        System.out.println(x);

//        Напишите программу для проверки равенства двух чисел 25 и 43.
        System.out.println("25 == 43 " + (25 == 43));

//        Даны две переменные a и b, значения которых равны 10 и 5 соответственно.
//        Напишите программу для сложения, вычитания, умножения, деления, деления по модулю двух переменных.
        a = 10;
        b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

//        Напишите программу для преобразования градусов Фаренгейта в градусы Цельсия.
        int F = 104;
        float C = (float) (F - 32) * 5 / 9;
        System.out.println("(" + F + "F - 32) * 5/9 = " + C);

//        Напишите программу, которая прибавляет 10 к числу 451, а затем делит его на 3.
//        Теперь к модулю результата прибавляется 5, а затем полученное значение умножается на 5.
//        Выведите на экран окончательный результат.
        int number = 451;
        number += 10;
        number %= 3;
        number += 5;
        number *= 5;
        System.out.println(number);

//        Даны две переменные a и b, значения которых равны 65 и 80 соответственно.
//        Напишите программу, чтобы проверить, верны ли оба условия 'a < 50' и 'a < b'.
        a = 65;
        b = 80;
        System.out.println((a < 50) && (a < b));

    }
}