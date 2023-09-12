package project2.Class.Ch17stream.lecture;

import java.util.List;

public class C11stream {
    public static void main(String[] args) {
        var list = List.of(10,35,72,2,7,11,33);

        System.out.println("가장 큰 수 출력");
        list.stream()
                .sorted((x,y)->y -x)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 작은 수 출력");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);
    }
}
