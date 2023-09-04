package project2.Class.ch09nested.book.sec07.exam01;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();

//        car.run1();
        car.run2();

        car.run3(new Tire() {
            public void roll(){
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다");
            System.out.println();
            }
        });
    }
}
