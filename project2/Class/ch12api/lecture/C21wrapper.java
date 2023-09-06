package project2.Class.ch12api.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i = 3;
        Integer j = Integer.valueOf(i);
        Object k = j;
        // 이건 옛날 방식이다.

        int l = 5;
        Integer m = l;
        Object o = m;
        Object n = 7;
        // 현재의 오토박싱 시스템

        System.out.println(k);
        System.out.println(o);
        System.out.println(n);

        int s = 30;
        long t = s;  // true

//        Integer u = 300;
//        Long v = u; // false

//        Float y = 3.14f;
//        Double z = y; // false



    }
}
