package Homework_8.Exercise_4;

public class Average {
    private final String ARR = "arr";
    private String type = "";
    int[] arr;

    int a;
    int b;
    int c;

    public Average(int[] arr) {
        this.arr = arr;
        this.type = ARR;
    }

    public Average(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getAVG() {
        if (this.type.equals(ARR)) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum / arr.length;
        } else {
            return (a + b + c) / 3;
        }
    }
}
