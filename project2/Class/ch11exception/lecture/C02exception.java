package project2.Class.ch11exception.lecture;

public class C02exception {

    public static void main(String[] args) {
        System.out.println("code 1...");
        System.out.println("code 2...");

        int[] arr = {1, 2};
        int i = arr[2];     // 예외 발생. 범위 초과 예외.

        System.out.println("code 3...");
    }

}
