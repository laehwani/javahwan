package project2.Class.ch19network.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C03client {

    // 클라이언트가 받는걸 작성해보자
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("172.30.1.92", 3000);

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        try (socket; is; isr; br) {
            String line = br.readLine();
            System.out.println("서버가 보낸 내용 : " + line);
        }
    }
}
