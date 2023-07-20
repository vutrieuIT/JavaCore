package calendar;

import java.util.Calendar;

// phương thức get
public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DAY: " + calendar.get(Calendar.DATE));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
    }
}
