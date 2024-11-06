package Homework_5;

public class Homework5 {
    public static void main(String[] args) {

//        1. Напишите программу, чтобы проверить значения длины и ширины прямоугольника и определить,
//        является ли он квадратным или нет.
        int h = 5, w = 5;
        if (h == w) {
            System.out.println("квадратный");
        } else {
            System.out.println("не квадратный");
        }


//        2. Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
//        Если стоимость товара ниже 5000, то стоимость остается без изменений.
//        Вычислите и выведите итоговую стоимость покупки для пользователя.
        int summa = 6000;
        if (summa > 5000) {
            summa -= (summa / 10);
        }
        System.out.println("Summa: " + summa);


//        3. В университете существуют следующие правила для системы оценок:
//        Ниже 25 - F
//        От 25 до 45 - E
//        От 45 до 50 - D
//        От 50 до 60 - C
//        От 60 до 80 - B
//        Выше 80 - A
//        Создайте переменную grade и напечатайте в консоль соответствующую оценку
//        в зависимости от значения переменной.
        int grade = 90;
        if (grade < 25) {
            System.out.println("F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("E");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }


//        4. Дано целое положительное число. Напишите программу, которая выводит это число в обратном порядке.
//        Например, если дано число 12345, то вывод будет следующим: 54321.
        int number = 12345;
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber += number % 10;
            if (number / 10 != 0) {
                reverseNumber *= 10;
            }
            number /= 10;
        }
        System.out.println(reverseNumber);
        System.out.println();


//        5. Дано целое положительное число. Напишите программу, которая выводит сообщение о том,
//        является ли это число простым.
        int numberN = 2;
        int index = 0;
        for (int i = 1; i <= numberN; i++) {
            if (numberN % i == 0) {
                index++;
                if (index > 2) {
                    break;
                }
            }
        }
        if (index > 2) {
            System.out.println("это число не является простым");
        } else {
            System.out.println("это число является простым");
        }


//        6. Напишите программу для печати следующего сообщения:
//        i)
//          **********
//          **********
//          **********
//          **********
        int starColumn = 10;
        int starRow = 4;
        for (int i = 0; i < starRow; i++) {
            for (int j = 0; j < starColumn; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        ii)
//          *
//          **
//          ***
//          ****
//          *****
        int heightOfThePyramid = 5;
        for (int i = 0; i < heightOfThePyramid; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        iii)
//
//               1
//              212
//             32123
//            4321234
//           543212345
        int lenth = 5;
        for (int i = 1; i <= lenth; i++) {
            for (int x = lenth; x > i; x--) {
                System.out.print(" ");
            }

            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


//        7. Даны два целых числа a и b. Напишите программу для вычисления суммы натуральных чисел
//        в диапазоне от a до b.
        int a = 1;
        int b = 10;
        int sumN = 0;
        for (int i = a; i <= b; i++) {
            sumN += i;
        }
        System.out.println(sumN);

//        8. В компании прошла аттестация по компетенциям и навыкам сотрудников.
//        Даны зарплата и класс сотрудника. Напишите программу, чтобы определить
//        сумму премии в зависимости от класса сотрудника. Необходимо создать переменную
//        со значением зарплаты сотрудника, вывести в консоль результирующую зарплату с премией.
//
//        Бонусы в зависимости от класса:
//
//        Класс A: 50%
//        Класс B: 25%
//        Класс C: 0%
        int salary = 350000;
        char employee = 'A';
        switch (employee) {
            case 'A':
                System.out.println("Класс " + employee + ": 50% Премия = " + (salary * 0.5));
                break;
            case 'B':
                System.out.println("Класс " + employee + ": 25% Премия = " + (salary * 0.25));
                break;
            case 'C':
                System.out.println("Класс " + employee + ": 0% Премия = " + (salary * 0));
                break;
        }

//        9. Дано целое положительное число n. Напишите программу для печати ряда Фибоначчи из n членов:
//        0 1 1 2 3 5 8 13 21 .....
        int n = 90;
        long F0 = 0, F1 = 1, Fn;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                Fn = F0;
            } else if (i == 1) {
                Fn = F1;
            } else {
                if (i % 2 == 0) {
                    Fn = F1 + F0;
                    F0 = Fn;
                } else {
                    Fn = F1 + F0;
                    F1 = Fn;
                }
            }
            System.out.print(Fn + " ");
        }

    }

}
