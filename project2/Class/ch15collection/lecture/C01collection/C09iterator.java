package project2.Class.ch15collection.lecture.C01collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("spring");
        set.add("css");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println("item : "+ item);
            iterator.remove();
        }

//        for (String elem : set) {
//            // 향상된 for 문 사용중
//            System.out.println("elem : "+ elem);
//            if(elem.equals("css"));{
//                set.remove("css");
//            }
//        }

    }
}
