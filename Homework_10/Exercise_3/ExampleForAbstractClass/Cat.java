package Homework_10.Exercise_3.ExampleForAbstractClass;

public class Cat extends Animals{
    public Cat(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public void voice() {
        System.out.println("meow meow");
    }
}
