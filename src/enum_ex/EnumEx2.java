package enum_ex;

// Duyệt các phần tử trong enum
public class EnumEx2 {
    public static void main(String[] args) {
        for (Season season : Season.values()){
            System.out.println(season);
        }
    }
}
