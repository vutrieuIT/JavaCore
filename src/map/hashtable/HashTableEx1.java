package map.hashtable;

import java.util.Hashtable;
import java.util.Set;

public class HashTableEx1 {
    public static void main(String args[]) {
        // init hashMap
        Hashtable<String, Student> hashMap = new Hashtable<String, Student>();
        // add elements to hashMap
        hashMap.put("1", new Student("A", 12, "Hanoi"));
        hashMap.put("3", new Student("C", 13, "Hanoi"));
        hashMap.put("2", new Student("E", 15, "Hanoi"));
        hashMap.put("4", new Student("D", 14, "Hanoi"));
        // show hashMap
        show(hashMap);
    }
    public static void show(Hashtable<String, Student> hashtable) {
        Set<String> keySet = hashtable.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + hashtable.get(key));
        }
    }
}
class Student{
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student@name=" + name + ",age=" + age + ",address=" + address;
    }
}