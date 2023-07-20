package enum_ex;

// Khởi tạo giá trị đặc biệt cho hằng số enum
enum Gender{
    MALE(1), FEMALE(0);

    public int value;

    private Gender(int value){
        this.value = value;
    }
}
public class EnumEx3 {
    public static void main(String[] args) {
        for (Gender gender: Gender.values()){
            System.out.println(gender + " " + gender.value);
        }
    }
}
