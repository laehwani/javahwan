package project2.Class.ch08interface.lecture;

import project2.Class.book.exercise.p04.package1.MyClass;

    // 인터페이스에 대해...
public class C03interface {
}

interface MyInterface031 {
    void method1();
}

interface MyInterface032 {
    void method2();

}
        // 여러 인터페이스를 구현 할 수 있다.
class MyClass03 implements MyInterface031, MyInterface032 {
            @Override
            public void method1() {
                System.out.println("티비를 켜욧");
            }

            @Override
            public void method2() {
                System.out.println("라디오를 켜욧");
            }
            public static void main(String[] args) {
                MyClass03 r = new MyClass03();
                r.method1();
                r.method2();

                MyInterface031 i1 = r;
                // r 의 주소값을 가지지만 i1 은 031 의 메서드값만 호출가능하다
                MyInterface032 i2 = r;
                // r 의 주소값을 가지지만 i1 은 031 의 메서드값만 호출가능하다
                i1.method1();
                i2.method2();
                r.method2();

            }

        }
