package project2.Class.ch11exception.book.sec02;

public class C05printStackTrace {

    public static void main(String[] args) {

        System.out.println("code1");
        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
            // 예외가 발생한 코드를 try/catch 문으로 감싸자.
        } catch (ArithmeticException e) {
            e.printStackTrace();
            // printStackTrace 는 예외 메시지를 일부러 출력해서 보여주는 용도이다.
            // printStackTrace 이 코드는 try/catch 문을 쓸때 무조건 쓴다고 외우자.
        }

        System.out.println("code3");
    }

}
