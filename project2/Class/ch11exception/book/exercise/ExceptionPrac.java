package project2.Class.ch11exception.book.exercise;

public class ExceptionPrac {

    public static void main(String[] args) {

        String[] strArray = {"10", "2a"};

        int value = 0;
        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
                System.out.println("출력");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스 초과");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할수 없음");
            } finally {
                System.out.println(value);
            }
        }
    }

}
