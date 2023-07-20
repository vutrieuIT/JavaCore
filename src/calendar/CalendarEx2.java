package calendar;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        Calendar calendar = new Calendar.Builder().setDate(2023, Calendar.FEBRUARY, 23).build();
        System.out.println(calendar.getTime());
    }
}
