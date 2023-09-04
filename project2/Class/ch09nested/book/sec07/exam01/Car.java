package project2.Class.ch09nested.book.sec07.exam01;

public class Car {
    private Tire tire1 = new Tire();

    private Tire tire = new Tire(){
        @Override
        public void roll() {
            System.out.println("익명 자식 tire 객체 1이 굴러갑니다");
        }
    };

    public void run1() {
        tire1.roll();
        tire.roll();
    }

    public void run2() {
        Tire tire = new Tire(){
            @Override
            public void roll() {
                System.out.println("익명 자식 객체 2가 굴러갑니다");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
