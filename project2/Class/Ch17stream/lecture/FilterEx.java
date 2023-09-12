package project2.Class.Ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {
    public static void main(String[] args) {

//        List<String > list = new ArrayList<>();
//        list.add("화니");
//        list.add("소미");
//        list.add("소미");
//        list.add("현이");
//        list.add("자바");

        var list = List.of("화니","소미","소미","혀니","자바");

        System.out.println("중복 데이터 제거");
        list.stream()
                .distinct()
                        .forEach(System.out::println);

        System.out.println("해당 단어로 시작하는 데이터만 출력");
        list.stream()
                .filter(s -> s.startsWith("자"))
                .forEach(System.out::println);

        System.out.println("중복을 제거하고 해당 단어로 시작하는 데이터만 출력");
        list.stream()
                .distinct()
                .filter(n -> n.startsWith("자"))
                .forEach(System.out::println);

    }
}
