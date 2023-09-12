package project2.Class.Ch17stream.lecture;

import java.util.List;

public class C10skip {
    public static void main(String[] args) {

        // skip() : 지정한 숫자만큼 스킵 즉, 제거하고 남은 숫자를 반환
        var list = List.of(10,9,1,2,3,5,7);
        list.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("가장 작은 값");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 큰 값 출력");
        list.stream()
                .sorted()
                .skip(list.size()-1)
                .forEach(System.out::println);

        System.out.println("가장 마지막 원소 출력");
        list.stream()
                .skip(list.size()-1)
                .sorted()
                .forEach(System.out::println);

    }
}
