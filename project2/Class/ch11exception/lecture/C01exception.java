package project2.Class.ch11exception.lecture;

public class C01exception {

    public static void main(String[] args) {
        System.out.println("실행코드1");
        System.out.println("실행코드2");

        int i = 0;
        int j = 3 / i;  // 예외가 뜸. 산술적 예외.

        System.out.println("실행코드3");
    }

}
