package project2.Class.Ch17stream.book.sec10;

import java.util.List;
import java.util.stream.Stream;

public class C21reference {
    public static void main(String[] args) {

        var list1 = List.of("java","spring","Css");

        Integer sum = list1.stream()
                .map(String::length)
                .reduce(Integer::sum)
                .get();
        System.out.println("sum = " + sum);

        // 참조타입 stream -> 기본타입 stream
        int sum1 = list1.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("sum1 = " + sum1);
    }
}
