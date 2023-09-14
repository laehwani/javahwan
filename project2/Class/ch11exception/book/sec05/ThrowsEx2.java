package project2.Class.ch11exception.book.sec05;

public class ThrowsEx2 {

    public static void main(String[] args) throws ClassNotFoundException {
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.Object");
    }

}
