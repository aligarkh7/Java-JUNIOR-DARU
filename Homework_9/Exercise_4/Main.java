package Homework_9.Exercise_4;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature('C');
        System.out.println(temperature.getScales());
        System.out.println(temperature.degreesCelsius());
        System.out.println(temperature.degreesFahrenheit());

        temperature.setTemperatures(10);
        System.out.println(temperature.getScales());
        System.out.println(temperature.degreesCelsius());
        System.out.println(temperature.degreesFahrenheit());

        temperature.setScales('F');
        System.out.println(temperature.getScales());
        System.out.println(temperature.degreesCelsius());
        System.out.println(temperature.degreesFahrenheit());

    }
}
