package Homework_9.Exercise_1;

import java.time.Year;

public class Student {
    private String name;
    private String id;
    private int year;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.year = Year.now().getValue();
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

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", year=" + year;
    }
}
