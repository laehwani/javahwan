package project2.Class.ch19network.lecture;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class C10client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("172.30.1.81", 7000);

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        Scanner scan = new Scanner(System.in);

        try (scan; bw; os; osw) {
            while (true) {
                System.out.println("입력");
                String chat = scan.nextLine();
                bw.write(chat);
                bw.newLine();
                bw.flush();

                if (chat.equals("bye")) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
