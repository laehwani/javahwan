package project2.Class.ch11exception.book.sec03;

public class ExceptionEx03 {

    public static void main(String[] args) {

        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (Exception e) {
                System.out.println("예외 사유: " + e.getMessage());
            }
        }
    }
}

