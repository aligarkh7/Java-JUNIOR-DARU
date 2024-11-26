package Homework_9.Exercise_1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dos", "AX155689");
        System.out.println(student.getId() + " " + student.getName() + " " + student.getYear());
        System.out.println(student);

        Student student1 = new Student("Dana", "CX524827");
        System.out.println(student1.getId() + " " + student1.getName() + " " + student1.getYear());
        System.out.println(student1);
    }
}
