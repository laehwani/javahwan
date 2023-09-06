package project2.Class.ch12api.book.sec3.exam02;

public class MathEx {
    public static void main(String[] args) {

        // 큰 정수 또는 작은 정수 얻기
        double v1 = Math.ceil(3.5);
        double v2 = Math.floor(5.3);

        System.out.println("v1 = "+ v1);
        System.out.println("v2 = "+ v2);

        // 서로간에 큰 값 또는 작은 값
        double v3 = Math.min(3,7);
        double v4 = Math.max(3,6);

        System.out.println("v3 = "+ v3);
        System.out.println("v4 = "+ v4);

        // 소수 이하 두 자리 얻기
        double value = 12.3456;
        double temp1 = value+ 100;
        long temp2 = Math.round(temp1);

    }
}
