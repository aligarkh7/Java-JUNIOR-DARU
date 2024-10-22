package Homework_3;

public class Homework3 {
    public static void main(String[] args) {
//        Создайте переменную с именем flowersName и присвойте ей значение Roses.
        String flowersName = "Roses";

//        Создайте переменную с именем flowersNumber и присвойте ей значение 101.
        int flowersNumber = 101;

//        Выведите значения переменных flowersName и flowersNumber в консоль.
        System.out.println(flowersName);
        System.out.println(flowersNumber);

//        Выведите на экран сумму 15 + 10, используя две переменные: a и b.
        int a = 15, b = 10;
        System.out.println(a + " + " + b);

//        Создайте переменную c, присвойте ей a + b и выведите результат.
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);

//        Создайте три переменные одного типа, используя список, разделенный запятыми,
//        и присвойте им разными значения. Выведите сумму трех переменных в консоль.
        int x = 4, y = 5, z = 3;
        System.out.println(x + y + z);

//        Создайте четыре переменных одного типа, используя список, разделенный запятыми,
//        и присвойте им одно значение. Выведите сумму четырех переменных в консоль.
        byte e, f, g, h;
        e = f = g = h = 2;
        System.out.println(e + f + g + h);

//        Объявите переменную типа double, но не инициализируйте ее. Присвойте ей значение позже.
//        Перезапишите существующее значение переменной.
        double number1;
        number1 = 1.0;
        number1 = 3.14;
        System.out.println(number1);

//        Создайте константы со значениями числа PI, ускорения свободного падения, наименования родного города.
        final double PI = 3.1415926535897932384626433832795;
        final double GRAVITY = 9.80665;
        final String HOMETOWN = "Almaty";
        System.out.println("числа PI: " + PI);
        System.out.println("ускорения свободного падения: " + GRAVITY);
        System.out.println("наименования родного города: " + HOMETOWN);

//        Создайте переменные типа byte, short, int, long, double, float, boolean, char, String,
//        и выведите каждое значение в консоль.
        byte numberTypeByte = 127;
        System.out.println("byte: " + numberTypeByte);
        short numberTypeShort = 32767;
        System.out.println("short: " + numberTypeShort);
        int numberTypeInt = 2147483647;
        System.out.println("int: " + numberTypeInt);
        long numberTypeLong = 9223372036854775807L;
        System.out.println("long: " + numberTypeLong);
        double numberTypeDouble = 1.7976931348623157E308;
        System.out.println("double: " + numberTypeDouble);
        float numberTypeFloat = 3.40282346638528860e+38F;
        System.out.println("float: " + numberTypeFloat);
        boolean bool = true;
        System.out.println("boolean: " + bool);
        char ASCII = 65;
        System.out.println("ASCII: 67 = " + ASCII);
        String str = "Hello World!";
        System.out.println(str);

//        Напишите программу для преобразования типа переменной:
//        Приведите пример расширяющего приведения
        byte numberByteIndex = 127;
        int numberIntIndex = numberByteIndex;
        numberIntIndex = 2147483647;
        System.out.println(numberIntIndex);

//        Приведите пример сужающего приведения
        numberIntIndex = 127;
        numberByteIndex = (byte) numberIntIndex;
        System.out.println(numberByteIndex);

    }
}
