package project2.Class.ch12api.book.sec6;

public class BoxingUnBoxingEx {
    public static void main(String[] args) {
        // boxing - 참조타입으로 바꾸는 것.
        Integer obj = 100;
        System.out.println("value: "+ obj);

        // unboxing - 기본타입으로 바꾸는 것.
        int value = obj;
        System.out.println("value: "+ value);

        // 연산식 unboxing - 기본타입으로 바꾸는 것.
        int result = obj + 100;
        System.out.println("result: "+ result);
    }
}
