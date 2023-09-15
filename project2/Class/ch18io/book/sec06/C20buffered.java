package project2.Class.ch18io.book.sec06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C20buffered {


    public static void main(String[] args) {

        try (Writer writer = new FileWriter("C:/Temp/out9.txt")) {
            long start = System.currentTimeMillis();

            for (int i = 0; i < 10000; i++) {
                writer.write('가');
            }
            writer.flush();
            long end = System.currentTimeMillis();
            System.out.println("그냥" + (end - start) + "ms");

            String path2 = "C:/Temp/out10.txt";
            Writer writer1 = new FileWriter(path2);
            Writer writer2 = new BufferedWriter(writer1);
            long start1 = System.currentTimeMillis();

            for (int i = 0; i < 10000; i++) {
                writer2.write('나');
            }
            writer1.flush();
            long end1 = System.currentTimeMillis();

            System.out.println("버퍼" + (end - start) + "ms");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
