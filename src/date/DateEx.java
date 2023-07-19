package date;

import java.util.Calendar;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date date = new Date(2023-1900, 6, 19);
        Date date2 = new Date(2023-1900, 6, 20);

        System.out.printf("ngay ke tiep cua ngay %s la ngay %s: %s\n",
                date.toGMTString(), date2.toGMTString(), date.before(date2));

        System.out.printf("so sanh ngay %s va ngay %s: %s\n",
                date.toGMTString(), date2.toGMTString(), date.compareTo(date2));
    }
}
