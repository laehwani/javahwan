package project2.Class.ch12api.lecture;

public class C22wrapper {
    public static void main(String[] args) {
        Integer i = 3000;
        Integer j = 3000;

        int k = 30;
        int l = 30;

        System.out.println(k == l);

        System.out.println(i == j);
        System.out.println(i.equals(j));
        // 참조타입은 == 이 아닌 .equals 로 표현해줘야만 한다.

    }
}
