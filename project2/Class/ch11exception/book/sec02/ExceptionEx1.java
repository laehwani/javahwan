package project2.Class.ch11exception.book.sec02;

public class ExceptionEx1 {

    public static void main(String[] args) {

        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다");
            // 위에 코드는 예외가 발생. 클래스 미지정 예외. try catch 문으로 감싸보자.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // 위에 메서드는 다음 장에서 설명.

        }
        System.out.println("완료");

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("실행 흐름 이어감..");
    }
}
