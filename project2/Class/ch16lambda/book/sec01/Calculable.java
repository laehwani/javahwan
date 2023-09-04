package project2.Class.ch16lambda.book.sec01;


@FunctionalInterface
    // 이 인터페이스가 추상메서드가 하나인지 컴파일러를 통해 검증
public interface Calculable {
    void calculate(int x, int y);

}
