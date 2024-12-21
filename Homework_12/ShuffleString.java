package Homework_12;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
        System.out.println(restoreString("abc",new int[]{0,1,2}));
    }

    private static String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);
    }
}
