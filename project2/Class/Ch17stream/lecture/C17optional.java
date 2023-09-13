package project2.Class.Ch17stream.lecture;

import java.util.List;
import java.util.Optional;

public class C17optional {
    public static void main(String[] args) {

        List<Integer> list = List.of();
        Optional<Integer> sum = list.stream()
                .reduce(Integer::sum);

//        sum.get();  // 배열에 값을 안주면 에러가 발생.

        System.out.println("sum.orElse(0) = "+ sum.orElse(5));
        // sum.orElse 는 T에 값을 넣지 않아도 T의 모든 매개 변수를 사용 할수 있게 해준다.

        System.out.println("프로그램 실행 중..");
    }


}
