package project2.Class.ch09nested.book.exercise.p06;

public class AnonymousEx {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.run();
        anony.method01();
        anony.method02(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다");
            }
        });
        anony.method02(()-> System.out.println("트럭이 달려욧!"));
    }
}
