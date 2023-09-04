package project2.Class.ch16lambda.book.sec04;

import project2.Class.ch16lambda.book.sec03.Person;

public class Lambda {
    public static void main(String[] args) {
        Som som = new Som();

        // 실행문이 두 개 이상일 경우
        som.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 실행문이 하나만 있을 경우( 연산식 )
        som.action((x, y) -> x + y);

        // 실행문이 하나만 있을 경우( 메서드 )
        som.action((x, y) -> sum(x,y));

    }
    public static double sum(double x, double y) {
        return x + y;
    }
}
