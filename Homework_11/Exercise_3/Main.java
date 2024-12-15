package Homework_11.Exercise_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int number = 0;

        try {
            for (Object s: string.replace(" ", "\n").lines().toArray()){
                number = number + Integer.parseInt(s.toString());
            }
            System.out.println(number);
        }catch (NumberFormatException e){
            System.out.println("Неправильный ввод");
        }
    }
}
