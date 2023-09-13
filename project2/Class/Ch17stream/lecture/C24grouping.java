package project2.Class.Ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C24grouping {
    public static void main(String[] args) {
        var list = List.of(
                "java","spring","css","html","react"
                        ,"vue","jquery","jsp" );

//        Map<Integer, List<String>> group = list.stream()
//                .collect(Collectors.groupingBy(
//                        String::length));
//        group.entrySet()
//                .forEach(e -> System.out.println(e.getKey()+""));
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        map.entrySet()
                .forEach(e-> System.out.println(e.getKey()+"개 글자는 : "+ e.getValue()+"개입니다"));
    }
}
