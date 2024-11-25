package Homework_7;

public class Exercise_3 {
    public static void main(String[] args) {
//        3. Напишите метод подсчета всех гласных букв в строке.
//        Дано:
//        DarTech123
//        Ожидаемый результат:
//        Количество гласных в строке: 2
        String str = "DarTech123";

        System.out.println("Количество гласных в строке: " + countVowels(str));
    }

    private static int countVowels(String str) {
        String vowels = "AEIOUY";
        int index = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (vowels.toLowerCase().indexOf(c) != -1) {
                index++;
            }
        }
        return index;
    }
}
