package project2.Class.ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23Keyboard {

    public static void main(String[] args) {
        InputStream keyboard = System.in;
        InputStreamReader isr = new InputStreamReader(keyboard);
        BufferedReader br = new BufferedReader(isr);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 위에 줄을 한줄로 줄인 코드.

        try {
            String line1 = br.readLine();
            System.out.println("line1 : " + line1);
            String line2 = br.readLine();
            System.out.println("line2 : " + line2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
