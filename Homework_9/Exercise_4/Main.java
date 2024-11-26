package Homework_9.Exercise_4;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        System.out.println(temperature);
        temperature.setTemperaturesScales(32,'F');
        System.out.println(temperature);

        Temperature temperature1 = new Temperature(16);
        System.out.println(temperature1);

        Temperature temperature2 = new Temperature('F');
        System.out.println(temperature2);

        Temperature temperature3 = new Temperature('C',25);
        System.out.println(temperature3);

        Temperature temperature4 = new Temperature('F', 50);
        System.out.println(temperature4);
        temperature4.setScales('C');
        System.out.println(temperature4.getScales());
        System.out.println(temperature4);
    }
}
