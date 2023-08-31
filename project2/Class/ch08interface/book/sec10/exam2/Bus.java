package project2.Class.ch08interface.book.sec10.exam2;

public class Bus implements Vehecle{
    @Override
    public void run() {
        System.out.println("버스가 달려욧");
    }

    public void checkFare() {
        System.out.println("승차요금 체크!!");
    }
}
