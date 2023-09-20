package project2.Class.ch19network.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class C05client {

    // 클라이언트가 서버에게 파일 보내기를 해보자
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("172.30.1.88", 3000);

        String path = "C:/Temp/test.png";
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);

        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        try (socket; fis; bis; os; bos) {

            byte[] bytes = new byte[1024];
            int length = 0;

            while ((length = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, length);
            }
            bos.flush();
        }
    }
}
