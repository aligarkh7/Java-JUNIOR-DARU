package Homework_10.Exercise_2;

public class Main {
    public static void main(String[] args) {
        for (Weekday day: Weekday.values()){
            if (day.isWeekDay()){
                System.out.println(day + " : weekday");
            }else {
                System.out.println(day + " : is not weekday");
            }
        }

        System.out.println();

        for (Weekday day: Weekday.values()){
            if (day.isHoliday()){
                System.out.println(day + " : holiday");
            }else {
                System.out.println(day + " : is not holiday");
            }
        }
    }
}
