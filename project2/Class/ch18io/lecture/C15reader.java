package project2.Class.ch18io.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C15reader {

    public static void main(String[] args) {
        // 문자 단위 입력 스트림
        //noinspection resource
        try (Reader reader = new FileReader("C:/temp/out7.txt")) {
            int read = reader.read();
            char c1 = (char) read;
            int read1 = reader.read();
            char c2 = (char) read1;
            int read2 = reader.read();
            char c3 = (char) read2;

            System.out.println("read : " + c1);    //"손"
            System.out.println("read1 : " + c2);  //"흥"
            System.out.println("read2 : " + c3);  //"민"

            char[] chars = new char[3];
            int len1 = reader.read(chars);
            System.out.println("chars : " + Arrays.toString(chars));
            int len2 = reader.read(chars);
            System.out.println("chars : " + Arrays.toString(chars));
            int len3 = reader.read(chars);
            System.out.println("chars : " + Arrays.toString(chars));

            System.out.println("len1 = " + len1);
            System.out.println("len2 = " + len2);
            System.out.println("len3 = " + len3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
