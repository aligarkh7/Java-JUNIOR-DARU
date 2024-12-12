package Homework_10.Exercise_3.ExampleForAbstractClass;

public class Dog extends Animals{
    public Dog(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public void voice() {
        System.out.println("Gav Gav");
    }
}
