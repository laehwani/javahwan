package project2.Class.Ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {
    public static void main(String[] args) {
        List<String> list = List.of("java","css","spring");
        Stream<String >stream = list.stream();

        stream.count();

//        stream.count();
        // 최종 연산이 끝나 stream 을 재사용할 수 없다
        // 재사용 하고 싶으면 스트림을 다시 만들어야 한다.

        Stream<String>stream1 = list.stream();

        System.out.println("프로그램 실행 중..");
    }
}
