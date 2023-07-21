package oop;

public abstract class Person {
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

    public abstract void introduce();


}
