package project2.Class.book.sec02.exam02;

public class AirplaneEx {
    public static void main(String[] args) {
        SuperSonic o1 = new SuperSonic();
        o1.takeoff();
        o1.fly();
        o1.flymode = SuperSonic.SuperSonic;
        o1.fly();
        o1.flymode = SuperSonic.Normal;
        o1.fly();
        o1.land();

    }
}
