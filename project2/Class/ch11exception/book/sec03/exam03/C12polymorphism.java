package project2.Class.ch11exception.book.sec03.exam03;

public class C12polymorphism {

    public static void main(String[] args) {

        try {
            // ClassCastException
            // NullPointerException
            // ArithmeticException
        } catch (ClassCastException e) {
            // 클래스캐스트예외는 이미 런타임에서 잡혔기 때문에 실행이 불가.
            // 하지만 순서를 바꿔주면? 가능하다.
        } catch (RuntimeException e) {
            // 위에 세 코드의 상위 타입인 런타임에러로 한번에 통일.
        }
    }
}
