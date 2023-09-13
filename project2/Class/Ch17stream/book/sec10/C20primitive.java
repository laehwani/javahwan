package project2.Class.Ch17stream.book.sec10;


import java.util.stream.IntStream;

// stream 의 형변환
public class C20primitive {
    public static void main(String[] args) {

        // 기본 타입 stream : Intstream, Longstream, Doublestream 이 있다.
        // 참조 타입 stream : Stream<T> 아무 타입이나 가능

        // 기본 타입 stream -> 참조타입 stream 으로 바꾸고 싶다면..
        Integer i = IntStream.of(3, 1, 7, 9, 21, 15)
                .boxed()
                .max(Math::max)
                .get();
        System.out.println("max = " + i);
    }
}
