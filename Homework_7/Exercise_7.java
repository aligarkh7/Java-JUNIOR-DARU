package Homework_7;

public class Exercise_7 {
    public static void main(String[] args) {
//        7. Напишите метод для определения площади пятиугольника.
//        Дано:
//        Количество сторон: 5
//        Длина стороны: 6
//        Ожидаемый результат:
//        Площадь пятиугольника равна 61,937

        int sides = 5;
        int lengthOfSide = 6;

        System.out.printf("Площадь пятиугольника равна %.3f", calculateAreaPentagon(lengthOfSide));
    }

    private static float calculateAreaPentagon(int lengthOfSide) {
        float h = (float) ((lengthOfSide / 2.0f) / (Math.tan(36 * (Math.PI / 180))));
        float A = (((lengthOfSide / 2.0f) * h) / 2) * 10;
        return A;
    }
}
