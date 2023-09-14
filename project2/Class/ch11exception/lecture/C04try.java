package project2.Class.ch11exception.lecture;

public class C04try {

    public static void main(String[] args) {

        System.out.println("code1");
        System.out.println("code2");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code3");
            System.out.println("code4");
        } catch (ArithmeticException e) {
            System.out.println("예외 코드1");
            System.out.println("예외 코드2");
        }
        // 코드 풀이 :
        // 예외가 발생한 코드3,4 를 트라이문으로 감싼후 캐치문으로 넘겼다

        System.out.println("code5");
    }

}
