package project2.Class.ch13generic.book.exercise;

import project2.Class.book.exercise.p12.A;
import project2.Class.ch08interface.book.sec02.Audio;
import project2.Class.ch13generic.book.sec02.exam01.Tv;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);    // list.add(new Integer(10));
        list.add(20);
        list.add("화니");
        // < > 제네릭스를 씀으로써 타입 체크가 강화되어
        // 아래와 같은 상황이 없어지기에 객체 타입을 반환받는데 안정성을 확연히 높일 수 있다.

//        Integer i = (Integer) list.get(2);
        // 문자열인 인덱스[2] 을 정수로 변환받고 싶어서 강제 형변환을 시켰다.
        // 하지만 문법상 이상은 없지만 형변환 에러가 뜬다. 강제 형변환의 위험성.
        System.out.println(list);

        ArrayList<Tv> tvList = new ArrayList<Tv>();
        tvList.add(new Tv());
//        tvList.add(new Audio());
        // 제네릭스로 Tv 를 넣음으로써 목록에 다른 객체가 들어오면 컴파일 에러가 발생하게 바뀌었다.
    }
}
