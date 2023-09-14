package project2.Class.ch11exception.book.sec05;

public class ThrowsEx {

    public static void main(String[] args) {

        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리 : " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.smith");
        System.out.println("예외");
    }
}
