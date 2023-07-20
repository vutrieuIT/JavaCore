package enum_ex;

// khai bao enum
enum SeasonEnum{
    SPRING, SUMMER, FALL, WINTER;
}
public class EnumEx {
    public static void main(String[] args) {

        SeasonEnum season = SeasonEnum.SPRING;
        System.out.println(season);

    }
}
