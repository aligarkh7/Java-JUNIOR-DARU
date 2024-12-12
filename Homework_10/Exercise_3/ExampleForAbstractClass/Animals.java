package Homework_10.Exercise_3.ExampleForAbstractClass;

public abstract class Animals {
    private int age;
    private String color;
    private String name;

    public Animals(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    abstract public void voice();

    public void eat(){
        System.out.println("eats...");
    }

    public void sleep(){
        System.out.println("sleep Z z z ...");
    }
}
