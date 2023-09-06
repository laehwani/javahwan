package project2.Class.ch12api.lecture;

public class C20wrapper {
    public static void main(String[] args) {
//         : 기본타입을 감싸고 있는 클래스
//          - 기본타입 : byte, short, int, long, float, double, char, boolean
//          - 래퍼클래스 : Byte, Short, Integer, Long, Float, Double, Character, Boolean
//          - boxing : 기본타입 --> 참조타입
//          - unboxing : 참조타입 --> 기본타입

        // boxing
        int i = 500;
        Integer j = Integer.valueOf(i);
        System.out.println(i);
        System.out.println(j);
        // unboxing
        Integer l = Integer.valueOf(1000);
        int m = l.intValue();
        System.out.println(l);
        System.out.println(m);
        // 다만 위에 방식은 이제 더이상 쓰이지 않는다. 자동으로 박싱이 되기 때문이다.

        // autoboxing
        int n = 777;
        Integer o = n;
        // autounboxing
        Integer q = 888;
        int w = q;
        System.out.println(o);
        System.out.println(q);






    }
}
