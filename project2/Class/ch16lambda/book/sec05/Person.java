package project2.Class.ch16lambda.book.sec05;

public class Person {
    void action(Calcu calcu) {
        double result = calcu.calc(10,4);
        System.out.println("결과 : "+ result);
    }
}

interface Calcu {
    double calc(double x, double y);
}
