package Homework_9.Exercise_4;

public class Temperature {
    private double temperatures;
    private char scales;

    public Temperature() {
        this.temperatures = 0;
        this.scales = 'C';
    }

    public Temperature(char scales) {
        this.temperatures = 0;
        setScales(scales);
    }

    public Temperature(double temperatures) {
        this.temperatures = temperatures;
        this.scales = 'C';
    }

    public Temperature(char scales, double temperatures) {
        this.temperatures = temperatures;
        setScales(scales);
    }

    public double degreesCelsius() {
        if (scales == 'F') {
            return 5 * (temperatures - 32) / 9;
        }
        return temperatures;
    }

    public double degreesFahrenheit() {
        if (scales == 'C') {
            return 9 * (temperatures / 5) + 32;
        }
        return temperatures;
    }

    public void setTemperatures(double temperatures) {
        this.temperatures = temperatures;
    }

    public char getScales() {
        return scales;
    }

    public void setScales(char scales) {
        if (scales == 'F')
            this.scales = scales;
        else
            this.scales = 'C';
    }

    public void setTemperaturesScales(double temperatures, char scales) {
        setTemperatures(temperatures);
        setScales(scales);
    }
}
