package project2.Class.ch15collection.book.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Member> mem = new HashSet<>();
        mem.add(new Member("길동", 30));
        mem.add(new Member("길동", 30));
        // 다른 객체이지만 동등한 갑을 가지기에 객체 1개만 저장.

        System.out.println("총 객체 수 : "+ mem.size());
    }
}
