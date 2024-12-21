package Homework_12;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};

        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder resWord1 = new StringBuilder();
        StringBuilder resWord2 = new StringBuilder();

        for (String s: word1){
            resWord1.append(s);
        }

        for (String s: word2){
            resWord2.append(s);
        }

        return resWord1.toString().equals(resWord2.toString());
    }
}
