package Homework_11.Exercise_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(divide(4,2));
        System.out.println(divide(4,0));
        System.out.println(divide(4,2));
    }

    private static double divide(int x, int y){
        if (y == 0){
            throw new RuntimeException("Число на 0 делить нельзя");
        }
        return (double) x /y;
    }
}
