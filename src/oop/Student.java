package oop;

public class Student extends Person implements IRelax{
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

    public void show(String address){
        System.out.printf("name is %s, age is %d, addess is %s\n", this.getName(),this.age, address);
    }

    @Override
    public void introduce() {
        System.out.printf("my name is %s, i'm %d\n", this.getName(), this.age);
    }

    @Override
    public void sing() {
        System.out.printf("I'm singing\n");
    }
}
