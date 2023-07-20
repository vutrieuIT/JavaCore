package enum_ex;


// So sánh các phần tử java enum
public class EnumEx5 {
    public static void main(String args[]) {
        Day day1 = Day.SUNDAY;
        Day day2 = Day.MONDAY;
        // use equal() method
        if (day1.equals(Day.SUNDAY)) {
            System.out.println("sunday");
        }
        // use '==' operator
        if (day2 == Day.MONDAY) {
            System.out.println("monday");
        }
    }
}
