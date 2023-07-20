package enum_ex;

// Sử dụng java enum trong câu lệnh switch
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY, SUNDAY
}
public class EnumEx4 {
    public static void main(String args[]) {
        Day day = Day.TUESDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            default:
                System.out.println("other day");
        }
    }
}
