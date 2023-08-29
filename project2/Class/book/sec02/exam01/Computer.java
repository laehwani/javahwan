package project2.Class.book.sec02.exam01;

public class Computer extends Calculator {

    @Override
    public double areaCircle(int r) {
        System.out.println("컴퓨터 객체의 areaCircle 실행");
        return Math.PI * r * r;
    }
}
