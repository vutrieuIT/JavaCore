package oop;

public class PolymorphismEx {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();

        person.show();
        person.show("Vietnam");
        student.show();
        teacher.show();

    }
}
