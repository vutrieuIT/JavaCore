package iterator;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Iterator với Set, tương tự với Map,Queue
public class IteratorEx1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("C#");
        set.add("C");

        // in set
        System.out.println("set ban đầu: ");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if (element.equals("C#")){
                iterator.remove();
            }
        }

        System.out.println("set sau khi xóa 'C#'");
        System.out.println(set);
    }
}
