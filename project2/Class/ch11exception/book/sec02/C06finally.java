package project2.Class.ch11exception.book.sec02;

public class C06finally {

    public static void main(String[] args) {

        System.out.println("code1");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("code3");
        } finally {
            // finally block :
            // 예외 발생과 관계 없이 실행되는 블럭
            System.out.println("꼭 실행 코드!!");
        }

    }

}
