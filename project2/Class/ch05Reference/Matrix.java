package project2.Class.ch05Reference;

public class Matrix {

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        // 쉽게 말해 이차원배열이기에 일차원배열을 뜻하는 소괄호 [] 를 두번 넣는다.
        int[][] b = a;
        // int[]b= a; 는 오류가 난다.
        System.out.println(a[0][2]); // 3
        System.out.println(b[1][2]); // 30

        a[2][2] = 2000;
        b[0][2] = 10000;
        System.out.println(a[2][2]); // 2000
        System.out.println(b[2][2]); // 2000
        System.out.println(a[0][2]); // 10000

        b[2] = new int[]{111, 222, 333};
        System.out.println(a[2][2]); // 333
        System.out.println(b[1][2]); // 30

        b = new int[][]{{33, 44}, {12, 34}};
        // b 에 새객체(인스턴스) 의 참조값을 할당했다.
        System.out.println(b[0][0]); // 33
        System.out.println(b[0][0]); // 1
    }

}
