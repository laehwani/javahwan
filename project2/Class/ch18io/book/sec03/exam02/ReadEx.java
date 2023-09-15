package project2.Class.ch18io.book.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {

    public static void main(String[] args) {

        String file = "C:/Temp/test2.db";
        try (InputStream is = new FileInputStream(file)) {

            byte[] array = new byte[100];

            while (true) {
                int num = is.read(array);
                // 최대 100 byte 를 읽고 읽은 byte는 data 저장, 읽은 수는 리턴.
                if (num == -1) {
                    break;
                    // 파일 끝에 도달했을 경우
                }

                for (int i = 0; i < num; i++) {
                    System.out.println(array[i]);
                    // 읽은 byte 를 출력
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
