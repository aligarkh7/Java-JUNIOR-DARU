package Homework_9.Exercise_1;

public class Student {
    private String name;
    private String id;
    private int year;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }
}
