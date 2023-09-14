package project2.Class.ch11exception.lecture;

public class C09catch {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 0};
            int i = 3 / arr[2];

            // try 블럭에서
            // 여러 exception 이 발생할 수 있으면
            // 여러 catch 블럭을 만들면 됨.
        } catch (ArithmeticException e) {
            System.out.println("잘못된 산술연산!!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스 참조@@");
            e.printStackTrace();

        }
        System.out.println("실행흐름 이어감..");
    }
}
