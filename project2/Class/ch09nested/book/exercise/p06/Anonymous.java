package project2.Class.ch09nested.book.exercise.p06;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다");
        }
    };

    void method01() {
        Vehicle localVar = ()-> System.out.println("트럭이 달립니다");
        localVar.run();
    }

    void method02(Vehicle v) {
        v.run();
    }
}
