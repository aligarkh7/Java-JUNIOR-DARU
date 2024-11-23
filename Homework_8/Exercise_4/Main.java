package Homework_8.Exercise_4;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {
                4,2,3
        };
        Average average = new Average(numbers);
        System.out.println(average.getAVG());

        Average average1 = new Average(1,2,3);
        System.out.println(average1.getAVG());
    }
}
