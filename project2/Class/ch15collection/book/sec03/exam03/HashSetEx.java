package project2.Class.ch15collection.book.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set. add ("java");
        set. add ("jdbc");
        set. add ("JSP");
        set. add ("jdva");

        Iterator<String> iterator = set.iterator();

        String next = iterator.next();
        System.out.println("next = "+ next);
        String next1 = iterator.next();
        System.out.println("next = "+ next1);
        iterator.next();
        iterator.next();

        for (String elem : set) {
            System.out.println("elem"+ elem);
        }
    }
}
