package ru.babushkina.week6.homework.task3;

public class WeekDayCheck {
    enum WeekDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        WeekDay i = WeekDay.WEDNESDAY;
        switch (i) {
            case MONDAY:
                System.out.println("Это будний день");
                break;

            case TUESDAY:
                System.out.println("Это будний день");
                break;

            case WEDNESDAY:
                System.out.println("Это будний день");
                break;

            case THURSDAY:
                System.out.println("Это будний день");
                break;

            case FRIDAY:
                System.out.println("Это будний день");
                break;

            case SATURDAY:
                System.out.println("Это выходной! :)");
                break;

            case SUNDAY:
                System.out.println("Это выходной! :)");
                break;
        }
    }
}
