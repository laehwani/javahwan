package project2.Class.ch08interface.book.sec10;

public class PromotionEx {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        // 구현 객체 생성

        A a;
        // 인터페이스 변수 선언

        a = b;      // A <-- B (자동 타입 변환)
        a = c;      // A <-- C (자동 타입 변환)
        a = d;      // A <-- D (자동 타입 변환)
        a = e;      // A <-- E (자동 타입 변환)


    }
}
