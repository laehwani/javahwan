package project2.Class.ch08interface.book.sec12.exam1;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스달려욧!!");
    }

    public void check() {
        System.out.println("카드를 찍어욧!!");
    }
}
