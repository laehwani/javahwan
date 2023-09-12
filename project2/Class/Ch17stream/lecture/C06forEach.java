package project2.Class.Ch17stream.lecture;

import java.util.List;

public class C06forEach {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 10, 9, 2);
        list.stream()
                .forEach(System.out::println);
        // 왜 굳이 스트림 메서드를 써야하는가..?
    }
}
