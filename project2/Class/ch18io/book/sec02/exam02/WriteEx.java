package project2.Class.ch18io.book.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

    public static void main(String[] args) {

        String path = "C:/Temp/test2.db";

        try (OutputStream os = new FileOutputStream(path)) {
            // 데이터 도착지를 test2.db 파일로 하는 byte 출력스트림 생성

            byte[] array = {10, 20, 30};

            os.write(array);    // 배열의 모든 byte 를 output

            os.flush();     // 내부 버퍼에 잔류하는 byte 를 출력하고 버퍼를 비
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
