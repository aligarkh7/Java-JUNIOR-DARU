package Homework_10.Exercise_2;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay(){
        if (this.equals(SUNDAY) || this.equals(SATURDAY)){
            return false;
        }
        return true;
    }

    public boolean isHoliday(){
        return !isWeekDay();
    }
}
