package Homework_12;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }

        return x == reverse || x == reverse / 10;
    }
}
