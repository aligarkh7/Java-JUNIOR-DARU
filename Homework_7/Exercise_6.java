package Homework_7;

public class Exercise_6 {
    public static void main(String[] args) {
//        6. Напишите метод, который проверяет, все ли символы в заданной строке являются гласными (a, e, i, o, u) или нет.
//        Верните true, если каждый символ строки является гласным, иначе верните false.
//        Дано:
//        AIEEE
//        Ожидаемый результат:
//        true

        String str = "AIEEE";

        System.out.println(isVowels(str));
    }

    private static boolean isVowels(String str){
        String vowels = "AEIOUY";
        for (char c: str.toLowerCase().toCharArray()){
            if (vowels.toLowerCase().indexOf(c)==-1){
                return false;
            }
        }
        return true;
    }
}
