package Homework_9.Exercise_3;

public class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public float findArea() {
        return a * a;
    }

    public float findPerimeter() {
        return a * 4;
    }

    public float findTheLengthOfTheDiagonal() {
        return (float) (a * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return "a = " + a + "\n" +
                "S = " + findArea() + "\n" +
                "P = " + findPerimeter() + "\n" +
                "Diagonal = " + findTheLengthOfTheDiagonal();
    }
}
