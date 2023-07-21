package oop;

public class Student extends Person{
    private Integer age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.printf("name is %s, age is %d\n", this.getName(), this.age);
    }
}
