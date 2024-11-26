package Homework_9.Exercise_2;

public class StarTriangle {
    private final String star = "[*]";
    private int width;
    private String string = "";

    public StarTriangle(int width) {
        this.width = width;
        creatingATriangle();
    }

    private void creatingATriangle() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j <= i; j++) {
                string += star;
            }
            string += "\n";
        }
    }

    @Override
    public String toString() {
        return string;
    }
}
