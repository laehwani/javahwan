package project2.Class.ch19network.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C08server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();

        Thread t = new Thread(() -> {
            try {
                String path = "C:/Temp/test.png";
                InputStream is = new FileInputStream(path);
                BufferedInputStream bis = new BufferedInputStream(is);

                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (serverSocket; socket; is; bis; os; bos) {
                    byte[] bytes = new byte[1024];
                    int len = 0;

                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }
                    bos.flush();
                    System.out.println("전송 완료!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}
