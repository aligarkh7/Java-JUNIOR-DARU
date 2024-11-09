package Homework_8.Exercise_4;

public class Average {
    int[] arr;

    int a;
    int b;
    int c;

    public Average(int[] arr) {
        this.arr = arr;
    }

    public Average(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getAVGArray() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public float getAVG() {
        return (a + b + c) / 3;
    }
}
