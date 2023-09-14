package project2.Class.ch11exception.lecture;

public class C13throw {

    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method01();
        } catch (RuntimeException e) {
            System.out.println("예외 발생!!!");

        }
        System.out.println("main code2");

    }

    public static void method01() {
        System.out.println("code1");
        throw new RuntimeException();
//        System.out.println("code2");
    }

    public static void method02() {
//        throw new Exception();
    }
}
