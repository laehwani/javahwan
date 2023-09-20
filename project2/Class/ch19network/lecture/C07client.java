package project2.Class.ch19network.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class C07client {

    public static void main(String[] args) throws IOException {

        // 서버가 클라이언트에게 파일 보내기
        Socket socket = new Socket("172.30.1.77", 5000);

        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);

        String path = "C:/Temp/test-server2.png";
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        try (socket; is; bis; fos; bos) {
            byte[] bytes = new byte[1024];
            int len = 0;

            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bos.flush();
            System.out.println("서버가 파일을 보냈습니다.");
        }
    }
}
