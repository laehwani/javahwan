package project2.Class.book.sec07.exam04;

public class CarEx {
    public static void main(String[] args) {

        Car mycar = new Car();
        // Car 객체 생성
        mycar.tire =new Tire();
        mycar.run();
        // Tire 객체 장착
        mycar.tire = new HankookTire();
        mycar.run();
        // 한국타이어 객체 장착
        mycar.tire = new KumhoTire();
        mycar.run();
        // 금호타이어 객체 장착
    }
}
