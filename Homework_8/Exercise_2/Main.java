package Homework_8.Exercise_2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("периметр треугольника равен " + triangle.perimeter());
        System.out.println("площадь треугольника равна " + triangle.area());
    }
}
