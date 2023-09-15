package project2.Class.ch18io.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class tryWithResource {

    public void method1() {
        OutputStream o1 = null;
        try {
            o1 = new FileOutputStream("");
            o1.write(010);
            o1.write(011);
            o1.write(017);

            o1.close();  // io stream 을 꼭 닫아야함
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                o1.close();  // io stream 을 꼭 닫아야함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {
        // 위의 코드를 줄여보자
        // try-with-resource 문법
        // 트라이위드리소스 문법에서 변수의 타입은 꼭! AutoCloseable 소속 타입이어야함
        try (OutputStream o2 = new FileOutputStream("");
            FileInputStream o4 = new FileInputStream("")) {
            o2.write(33);
            o2.write(77);
            o4.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method3() {
        try (
            FileOutputStream o3 = new FileOutputStream("");
            FileInputStream o4 = new FileInputStream("")
        ) {
            o3.write(234);
            o4.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method4() {
        Scanner scan = new Scanner("");
        try (scan) {
            scan.hasNext();
            scan.next();
        }
    }

    public void method6() throws IOException {

        // 안 좋은 코드임...
        FileOutputStream o3 = new FileOutputStream("");
        FileInputStream o4 = new FileInputStream("");

        o3.write(213);
        o4.read();
    }
}
