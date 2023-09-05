package project2.Class.ch12api.lecture;

import java.util.HashSet;

public class C10set {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        // hashset 은 서로 다른
        set.add(new Object());
        set.add(new Object());

        System.out.println(set.size());

        set.add(new String("java"));
        System.out.println(set.size());

        set.add(new String("java"));
        System.out.println(set.size());
    }
}
