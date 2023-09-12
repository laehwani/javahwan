package project2.Class.Ch17stream.lecture;

import java.util.List;

public class C09Limit {
    public static void main(String[] args) {

        // limit(갯수) : 갯수만큼 리스트배열안에 있는 데이터를 순서대로 반환
        var list = List.of(3,9,10,7,23,0,-3);

        System.out.println("가장 작은 값 4개를 출력해");
        list.stream()
                .sorted()   // 반환한 값 4개를 정렬
                .limit(4)   // 리스트배열중에 순서대로 4개를 반환
                .forEach(System.out::println);

        System.out.println("앞에 4개를 정렬해서 출력해");
        list.stream()
                .limit(4)   // 리스트배열중에 순서대로 4개를 반환
                .sorted()   // 리스트 배열 정렬
                .forEach(System.out::println);
        // 위의  예시 두개를 보면 순서에 따라 출력 값이 다르다.
        // 코드는 항상 순서가 중요하다.
    }
}
