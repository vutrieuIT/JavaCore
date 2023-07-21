package oop;

public class Teacher extends Person{
    private String clazz;

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void show(){
        System.out.printf("name is %s, teaching class %s", this.getName(), this.clazz);
    }
}
