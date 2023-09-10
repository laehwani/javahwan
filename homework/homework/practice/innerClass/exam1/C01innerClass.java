package homework.homework.practice.innerClass.exam1;

public class C01innerClass {
    class InstanceInner {
        // 인스턴스 내부클래스
        int iv = 100;
        static int cv = 100;    // 에러! static 변수를 선언할 수 없다.
        final static int CONST = 100; // final static 은 상수이므로 허용한다!
    }

    static class StaticInner {
        // 스태틱 내부 클래스
        int iv = 200;
        static int cv = 200;    // static 클래스만 static 멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {
            // 지역 내부 클래스
            int iv = 300;
            static int cv = 300;    // 에러! static 변수를 선언할 수 없다.
            final static int CONST = 300; // final static 은 상수이므로 허용한다!
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
//        System.out.println(LocalInner.CONST);
        // 에러. 지역클래스는 그 지역 안에서만 쓸 수 있는 클래스기 때문에 외부에서 접속할 수 없다.
    }
}
