package project2.Class.Ch17stream.lecture;

import project2.Class.book.exercise.p08.SnowTire;

import java.util.List;
import java.util.stream.Stream;

public class C02stream {
    public static void main(String[] args) {
        List<String> list = List.of("ab","ad","ae");
        Stream<String> stream = list.stream();
        Stream<String> stream1 = stream.map(e-> e+e);
        long count = stream1.count();

        list.stream()
                .map(e -> e+e)      // 중간 연산
                .filter(e -> e.length()>1)  // 중간 연산
                .count();       // 최종 연산
    }
}
