package project2.Class.ch11exception.book.sec03.exam02;

public class ExceptionEx {

    public static void main(String[] args) {

        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println(i + " : " + value);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (Exception e) {
                // Exception 은 모든 걸 포함하는 최상위 오브젝트 예외 클래스이므로
                // 맨 마지막에 두는게 좋다.
                System.out.println("실행에 문제가 있습니다.");
            }
        }

    }

}
