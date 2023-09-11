package project2.Class.ch15collection.lecture.C01collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {

        // map 전체 탐색 기능
        Map<String, String> map = new HashMap<>();
        map.put("학생1", "흥민");
        map.put("학생2", "강인");
        map.put("학생3", "민재");

        // KeySet
        System.out.println("KeySet 사용해서 전체 탐색");
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key+ " : " + map.get(key));
        }

            // 향상된 for
        System.out.println("향상된 for문으로 전체 탐색");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }

        // forEach
        System.out.println("forEach 메서드로 전체탐색");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+ " : " +s2);
            }
        });
//        map.forEach((s, s2) -> System.out.println(s+ " : " +s2));
    }
}
