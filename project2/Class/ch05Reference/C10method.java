package project2.Class.ch05Reference;

public class C10method {

    public static void main(String[] args) {

        int[] a = {3, 4, 5};

        System.out.println("main 메서드");
        System.out.println(System.identityHashCode(a));

        System.out.println(a[1]);
        num1(a);

        System.out.println("메서드 호출후");
        System.out.println(a[0]);
    }

    public static void num1(int[] p) {
        System.out.println("num1 메서드");
        System.out.println(System.identityHashCode(p));
        System.out.println(p[1]);

        p[0] = 33;
    }
}
