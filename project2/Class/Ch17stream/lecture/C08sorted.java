package project2.Class.Ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {

        // sorted() : 스트림 메서드중 정렬 기능
        var list = List.of(3, 1, 3, 4, 5, 10, 13, 0);
        list.stream()
                .sorted()   // 스트림 메서드중 정렬 기능
                .forEach(System.out::println);
    }
}
