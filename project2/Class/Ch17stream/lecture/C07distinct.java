package project2.Class.Ch17stream.lecture;

import java.util.List;

public class C07distinct {

    // distinct() : 스트림메서드의 중복 제거 기능
    public static void main(String[] args) {
        List<Integer> list =List.of(3,1,7,2,1,2,6);
        long count = list.stream()
                .distinct() // 중복 제거 기능
                .count();   // 최종 연산

        System.out.println("count : "+ count);
    }
}
