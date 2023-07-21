package oop;



public class AbstractionEx {
    public static void main(String[] args) {

        Person person = new Person() {
            @Override
            public void introduce() {
                System.out.printf("My name is %s\n", getName());
            }
        };

        Student student = new Student();
        Teacher teacher = new Teacher();

        person.introduce();
        student.introduce();
        student.sing();
        teacher.introduce();

    }
}
