package Homework_7;

public class Exercise_4 {
    public static void main(String[] args) {
//        4. Напишите метод для подсчета всех слов в строке.
//        Дано:
//        Введите строку: Java is good to learn Object Oriented programming.
//        Ожидаемый результат:
//        Количество слов в строке: 8

        String str = "Java is good to learn Object Oriented programming";

        System.out.println("Количество слов в строке: " + countWord(str));
    }

    private static int countWord(String str){
        return str.replaceAll(" ","\n").lines().toArray().length;
    }
}
