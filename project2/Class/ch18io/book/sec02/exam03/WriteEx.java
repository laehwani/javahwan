package project2.Class.ch18io.book.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

    public static void main(String[] args) {

        String path = "C:/Temp/text4.txt";

        try (OutputStream os = new FileOutputStream(path)) {
            byte[] array = {10, 20, 30, 40, 50};

            os.write(array);
            os.write(array, 1, 3);
            os.write(array, 0, 2);

            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
