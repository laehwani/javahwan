package project2.Class.ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C08read {

    public static void main(String[] args) {

        String file = "C:/Temp/test3.txt";
        byte[] arr;
        try (InputStream is = new FileInputStream(file)) {

            arr = new byte[3];

            int read = is.read(arr);    //3바이트
            int read1 = is.read(arr);   //3바이트
            int read2 = is.read(arr);   //3바이트
            int read3 = is.read(arr);
            //배열의 길이가 3개라 더이상 읽을게 없어서 1바이트
            int read4 = is.read(arr);
            int read5 = is.read(arr);
            //초과되고 있기에 -1바이트

            System.out.println("read : " + read);
            System.out.println("read1 : " + read1);
            System.out.println("read2 : " + read2);
            System.out.println("read3 : " + read3);
            System.out.println("read4 : " + read4);
            System.out.println("read5 : " + read5);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
