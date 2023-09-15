package project2.Class.ch18io.book.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {

    public static void main(String[] args) {

        // 문자 기반 출력 스트림생성
        try (Writer writer = new FileWriter("C:/Temp/out5.txt")) {

            // 1문자씩 출력
            char a = '나';
            writer.write(a);
            char b = '는';
            writer.write(b);

            // char 배열 출력
            char[] arr = {'배', '고', '파'};
            writer.write(arr);

            // 문자열 출력
            writer.write("배가 고프다");
            writer.flush();
            // 항상 플러쉬로 , 버퍼 비워줌

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
