package project2.Class.ch08interface.book.sec11;

import project2.Class.ch08interface.book.sec11.Vehicle;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달ㄽ");
    }
}
