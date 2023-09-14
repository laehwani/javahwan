package project2.Class.ch11exception.book.exercise;

public class C10catch {

    public static void main(String[] args) {

        try {
            // exception 발생 가능 코드
        } catch (ArrayIndexOutOfBoundsException e) {
            // exception 처리 코드
        } catch (NumberFormatException e) {
            // exception 처리 코드
        }

        try {

        } catch (NullPointerException | ClassCastException e) {
            // 이렇게 하나로 코드를 캐치 블럭을 함축시킬수 있다.
        }
    }

}
