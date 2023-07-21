package oop;

public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.printf("name is %s\n", this.name);
    }

    public void show(String address){
        System.out.printf("name is %s, addess is %s\n", this.name, address);
    }
}
