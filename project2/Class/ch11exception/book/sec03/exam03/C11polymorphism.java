package project2.Class.ch11exception.book.sec03.exam03;

public class C11polymorphism {

    public static void main(String[] args) {

        try {
        } catch (NullPointerException e) {
            // 동일한 예외처리 코드
        } catch (ArithmeticException e) {
            // 동일한 예외처리 코드
        }
        try {

        } catch (RuntimeException e) {
            // 동일한 예외처리 코드
            // 눌포인트와 아리스메틱 예외의 상위 타입이
            // 런타임에러 이므로 런타임에러 로 한번에 잡을 수 있다.
        }
    }
}
