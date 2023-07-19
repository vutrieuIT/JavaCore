package map.hashmap;

import java.util.HashMap;

// truy cap, chinh sua, xoa phan tu
public class HashMapEx4 {
    public static void main(String args[]) {
        // init hashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // add elements to hashMap
        hashMap.put(1, "Java");
        hashMap.put(3, "C++");
        hashMap.put(2, "PHP");
        hashMap.put(4, "Python");
        // cap nhat gia tri phan tu co key la 4
        hashMap.put(4, "C#");
        // xoa phan tu co key la 3
        hashMap.remove(3);
        // hien thi HashMap
        System.out.println("Phan tu co key = 1 la: " + hashMap.get(1));
        System.out.println("Phan tu co key = 2 la: " + hashMap.get(2));
        System.out.println("Phan tu co key = 3 la: " + hashMap.get(3));
        System.out.println("Phan tu co key = 4 la: " + hashMap.get(4));
    }
}
