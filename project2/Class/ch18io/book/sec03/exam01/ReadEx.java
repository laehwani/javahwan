package project2.Class.ch18io.book.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {

    public static void main(String[] args) {

        String path = "C:/Temp/test1.db";
        try (InputStream is = new FileInputStream(path)) {

            while (true) {
                int data = is.read();
                if (data == -1) {
                    break;
                }
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
