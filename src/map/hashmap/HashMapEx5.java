package map.hashmap;

// Generic custom data type

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx5 {
    public static void main(String args[]) {
        // init hashMap
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        // add elements to hashMap
        hashMap.put("1", new Student("A", 12, "Hanoi"));
        hashMap.put(null, new Student("C", 13, "Hanoi"));
        hashMap.put("2", null);
        hashMap.put("4", new Student("D", 14, "Hanoi"));
        // show hashMap
        show(hashMap);
    }

    public static void show(Map<String, Student> map) {
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
class Student {
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