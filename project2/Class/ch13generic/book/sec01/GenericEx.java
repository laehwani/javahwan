package project2.Class.ch13generic.book.sec01;

public class GenericEx {
    public static void main(String[] args) {
        Box<String> o1 = new Box<>();
        o1.content = " 안녕 ";
        String str = o1.content;
        System.out.println(str);
        // Box객체를 생성할 때 타입파라미터 T 대신 String 으로 대체

        Box<Integer> o2 = new Box<>();
        o2.content = 30;
        Integer str2 = o2.content;
        System.out.println(str2);
        // Box객체를 생성할 때 타입파라미터 T 대신 Integer 으로 대체
    }
}
