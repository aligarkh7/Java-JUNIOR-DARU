package Homework_10.Exercise_4;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        addStudent(1);
        addStudent(2);
        addStudent(5);
        addStudent(4);

        students.forEach(student -> System.out.println(student));
    }

    private static void addStudent(int grade) {
        Student student = new Student(grade);
        students.add(student);
    }
}
