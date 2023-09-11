package project2.Class.ch15collection.book.sec03.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        //객체 저장
        map.put("권", 85);
        map.put("동", 90);
        map.put("군", 80);
        map.put("길", 95);
        System.out.println("총 Entry 의 수  " + map.size());
        System.out.println();

        // 키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key+ " : "+ value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : "+ v);
        }
        System.out.println();

    }
}
