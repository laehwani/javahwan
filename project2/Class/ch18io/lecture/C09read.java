package project2.Class.ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C09read {

    public static void main(String[] args) {

        String file = "C:/Temp/test3.txt";

        try (InputStream is = new FileInputStream(file)) {

            byte[] array = new byte[3];

            is.read(array);
            System.out.println("Arrays.toString(array) : " + Arrays.toString(array));
            is.read(array);
            System.out.println("Arrays.toString(array) : " + Arrays.toString(array));
            is.read(array);
            System.out.println("Arrays.toString(array) : " + Arrays.toString(array));
            is.read(array);
            System.out.println("Arrays.toString(array) : " + Arrays.toString(array));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
