package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// duyet Set
public class SetEx {
    public static void main(String[] args) {

        Set<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");

        System.out.println("Số phần tử của setA: " + setA.size());


        // dung Iterator
        System.out.println("Các phần tử của setA (dùng Iterator): ");
        Iterator<String> iterator = setA.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }

        // dung for-each
        System.out.println("Các phần tử của setA (dùng for-each): ");
        for (String element : setA) {
            System.out.println(element);
        }
    }
}
