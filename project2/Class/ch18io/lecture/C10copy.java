package project2.Class.ch18io.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C10copy {

    public static void main(String[] args) {

        String src = "C:/Temp/test2.txt";
        String des = "C:/Temp/test2_copy.txt";

        try (InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des)) {

            byte[] b = new byte[3];
            int len = 0;

            while ((len = is.read(b)) != -1) {
                os.write(b, 0, len);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}