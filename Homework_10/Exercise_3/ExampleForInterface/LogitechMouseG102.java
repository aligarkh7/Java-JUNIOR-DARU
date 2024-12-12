package Homework_10.Exercise_3.ExampleForInterface;

public class LogitechMouseG102 implements Mouse {
    private int DPI;

    public LogitechMouseG102() {
        this.DPI = 400;
    }

    @Override
    public void move(int X, int Y) {
        System.out.println("move to coordinate " + X + " " + Y);
    }

    @Override
    public void click() {
        System.out.println("mouse click");
    }

    @Override
    public void clickButtonDpi() {
        if (this.DPI >= 1200) {
            this.DPI = 400;
        } else {
            this.DPI += 400;
        }
        System.out.println("mouse dpi changed " + DPI);
    }

}
