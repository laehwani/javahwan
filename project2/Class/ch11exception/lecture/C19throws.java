package project2.Class.ch11exception.lecture;

public class C19throws {

    // throws 는 그 메서드를 끝으로 실행을 종료시킨다.
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }

    public static void method1() throws ClassNotFoundException {
        method2();
    }

    public static void method2() throws ClassNotFoundException {
        method3();
    }

    public static void method3() throws ClassNotFoundException {
    }

}
