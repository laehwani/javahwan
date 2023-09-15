package project2.Class.ch18io.book.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx {

    public static void main(String[] args) {

        // 1문자씩 읽기
        try (Reader reader = new FileReader("C:/Temp/out7.txt")) {
            while (true) {
                int data = reader.read();
                if (data == -1) {
                    break;
                }
                System.out.println((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 문자 배열로 읽기
        try (Reader reader = new FileReader("C:/Temp/out7.txt")) {

            char[] data = new char[100];

            while (true) {
                while (true) {
                    int num = reader.read(data);  // 문자를 읽음
                    if (num == -1) {
                        break;          // 파일을 다 읽으면 while문 종료
                    }
                    for (int i = 0; i < num; i++) {
                        System.out.println(data[i]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
