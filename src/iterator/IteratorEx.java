package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Iterator với List
public class IteratorEx {
    public static void main(String[] args) {
        ArrayList listLanguages = new ArrayList();

        // them phan tu vao array list
        listLanguages.add("Java");
        listLanguages.add("Python");
        listLanguages.add("PHP");
        listLanguages.add(".NET");
        listLanguages.add("C");
        listLanguages.add("C++");

        // su dung iterator de hien thi noi dung cua listLanguages
        System.out.println("danh sách ngôn ngữ lập trình: ");
        Iterator itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();

        // sua cac phan tu duoc lap
        ListIterator litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + " (PASS)");
        }
        System.out.println("nội dung đã được sửa của listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();

        // hien thi cac phan tu theo thu tu nguoc lai
        System.out.println("nội dung đã được sửa của listLanguages "
                + "theo thứ tự ngược lại: ");
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.println(element);
        }
        System.out.println();

        // xoa phan tu C (PASS)
        litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            if ("C (PASS)".equals(element.toString())) {
                litr.remove();
            }
        }
        System.out.println("nội dung đã được sửa của listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();
    }
}
