package project2.Class.ch19network.lecture;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C04server {

    // 서버가 주는걸 작성해보자
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(3000);
        Socket socket = serverSocket.accept();

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        try (serverSocket; socket; os; osw; bw) {
            bw.write("안녕하세요 클라이언트😁😁");
        }
    }
}
