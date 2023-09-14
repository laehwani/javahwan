package project2.Class.ch11exception.lecture;

public class C07finally {

    public static void main(String[] args) {

        System.out.println("code1");
        try {
            int j = 3 / 3;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            System.out.println("code3");
            return;
        } finally {
            System.out.println("code4");
        }
        System.out.println("code5");
        // 리턴으로 문장을 끝냈기에 code4 는 실행이 안된다.
        // 하지만 리턴을 쓰던 안쓰던 출력하고 싶다면?

    }

}
