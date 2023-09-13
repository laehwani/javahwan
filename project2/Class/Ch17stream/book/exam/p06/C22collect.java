package project2.Class.Ch17stream.book.exam.p06;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class C22collect {
    public static void main(String[] args) {
        var list = List.of("java","spring","css","html");

        // 고전적인 방법으로 배열 문자열들의 길이 구하기
        var res1 = new ArrayList<>();
        for (String str : list) {
            res1.add(str.length());
        }
        System.out.println("res1 : "+ res1);

        // list.stream 으로 구해보기
        List<Integer> res2 = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("res2 : "+ res2);

        // set 으로 구해보기
        Set<Integer> res3 = list.stream()
                .map(String::length)
                .collect(Collectors.toSet());
        System.out.println("res2 : "+ res3);

        // map 으로 구해보기
        Map<String, Integer> res4 = list.stream()
                .collect(Collectors.toMap(x -> x, String::length));
        System.out.println("res4 : "+ res4);

    }
}
