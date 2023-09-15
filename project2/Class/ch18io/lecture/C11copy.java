package project2.Class.ch18io.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C11copy {

    public static void main(String[] args) {

        String str = "C:/Temp/text4.txt";
        String file = "C:/Temp/text4.txt";

        try (
            InputStream is = new FileInputStream(str);
            OutputStream os = new FileOutputStream(file)) {

            byte[] buf = new byte[1024];

            int len = 0;
            while ((is.read(buf)) != -1) {
                os.write(buf, 0, len);
            }
            os.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
