package project2.Class.ch08interface.book.sec10.exam2;

public class CastingEx {
    public static void main(String[] args) {
        Vehecle o1 = new Bus();
        o1.run();
//        o1.checkFare();
        Bus o2 = (Bus) o1;
        o2.run();
        o2.checkFare();
    }
}
