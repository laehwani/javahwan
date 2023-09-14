package project2.Class.ch11exception.lecture;

public class C03try {

    public static void main(String[] args) {
        System.out.println("code 1...");
        System.out.println("code 2...");

        try {
            // try 블럭 :
            // exception 이 발생할 수 있는 코드
            int i = 0;
            int j = 3 / i;  // 이대로면 예외 발생. 산술적 예외
        } catch (ArithmeticException e) {
            // catch 블럭 :
            // 발생한 exception 객체를 잡은 후 실행하는 코드
            System.out.println("예외 발생 시 실행되는 코드1");
            System.out.println("예외 발생 시 실행되는 코드2");
        }
        // 트라이 캐치문으로 예외를 잡아 런타임이 가능하게 한 모습.

        System.out.println("code 3...");
    }

}
