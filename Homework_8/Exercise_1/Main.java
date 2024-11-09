package Homework_8.Exercise_1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Алиса";
        student.surname = "Смит";
        student.address = "Коктем-2";
        student.id = 24;
        System.out.println(student.toString());

        Student student1 = new Student();
        student1.name =  "Азамат";
        student1.surname = "Трамп";
        student1.address = "Коктем-1";
        student1.id = 22;
        System.out.println(student1.toString());

        Student student2 = new Student();
        student2.name =  "Кристина";
        student2.surname = "Маргарет";
        student2.address = "Алатау-1";
        student2.id = 21;
        System.out.println(student2.toString());
    }
}
