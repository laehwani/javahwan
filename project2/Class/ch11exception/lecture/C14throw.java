package project2.Class.ch11exception.lecture;

public class C14throw {

    public static void main(String[] args) {

        System.out.println("main code1");
        try {
            method03();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code2");
    }

    private static void method03() throws Exception {
        throw new Exception();
        // 일반 예외는 컴파일러 에러이므로
        // 컴파일 단계에서 이미 빨간줄 에러가 뜨면서 실행불가해진다.
        // 이것을 굳이 쓰려면 일반 예외를 명시를 해주어야 한다.
    }

}
