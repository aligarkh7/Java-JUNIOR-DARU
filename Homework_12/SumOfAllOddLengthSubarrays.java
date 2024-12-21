package Homework_12;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {10,11,12};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    private static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 0; j < arr.length; j++) {
                if (j + i < arr.length) {
                    for (int k = j; k < i + j + 1; k++) {
                        sum += arr[k];
                    }
                }
            }
        }
        return sum;
    }
}
