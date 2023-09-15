package project2.Class.ch18io.book.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyEx {

    public static void main(String[] args) {

        String str = "C:/Temp/text4.txt";
        String file = "C:/Temp/text4.txt";

        try (
            InputStream is = new FileInputStream(str);
            OutputStream os = new FileOutputStream(file)) {

            byte[] data = new byte[1024];

            while (true) {
                int num = is.read(data);
                if (num == -1) {
                    break;
                }
                os.write(data, 0, num);
            }
            os.flush();
            System.out.println("복사가 잘 되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
