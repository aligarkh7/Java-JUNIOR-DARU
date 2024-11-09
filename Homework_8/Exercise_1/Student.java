package Homework_8.Exercise_1;

public class Student {
    String name;
    String surname;
    String address;
    int id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
