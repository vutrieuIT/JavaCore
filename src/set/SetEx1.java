package set;

import java.util.HashSet;
import java.util.Set;

// thao tac voi cac phan tu
public class SetEx1 {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");

        System.out.println("Các phần tử của setA trước khi xóa: ");
        showSet(setA);

        // xóa phần tử PHP khỏi setA
        setA.remove("PHP");
        System.out.println("Các phần tử của setA sau khi xóa: ");
        showSet(setA);

        // copy setA
        Set<String> setB = new HashSet<>(setA);


        // xoa het phan tu trong setA
        setA.clear();
        System.out.println("số phần tử của setA: " + setA.size());
        System.out.println("số phần tử của setB: " + setB.size());
    }

    public static void showSet(Set<String> set){
        for (String element : set) {
            System.out.println(element);
        }
    }
}
