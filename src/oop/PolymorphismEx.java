package oop;

public class PolymorphismEx {
    public static void main(String[] args) {

        Student student = new Student();
        Teacher teacher = new Teacher();

        student.show("Vietnam");
        student.show();
        teacher.show();

    }
}
