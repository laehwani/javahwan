package project2.Class.ch18io.lecture;

public class C25printf {

    public static void main(String[] args) {
        System.out.printf("출력할 문자들");
        System.out.printf("출력할 문자들2", "자바", 3, 3.14);

        System.out.printf("출력할 문자들 3%n다음줄 출력됨");
        // %n : 한줄 띄어쓰기
        System.out.printf("첫 번째 숫자: %2$d%n, 두 번째 숫자: %1$d%n", 100, 200);
    }
}

