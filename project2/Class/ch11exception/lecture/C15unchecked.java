package project2.Class.ch11exception.lecture;

import java.util.List;

public class C15unchecked {

    public static void main(String[] args) {

        var list = List.of(4, 5, 1);
        list.get(0);
        list.get(1);
        list.get(2);
        list.get(3);
        // 배열에 없는 숫자를 get 하는 에러코드이다
        // 하지만 문법적으론 문제가 없어보이고 컴파일이 진행된다.
        // 이것이 런타임 예외이고, 치명적인 에러이기도 하다.

        System.out.println("프로그램 실행 이어감");
    }

}
