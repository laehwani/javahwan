package project2.Class.ch18io.lecture;

import java.io.File;

public class C29file {

    public static void main(String[] args) {

        File file = new File("C:/Temp");

        // 디렉토리인지?
        System.out.println("file.isDirectory : " + file.isDirectory());
        // 파일 목록 얻기
        File[] files = file.listFiles();
        // 파일정보 출력
        for (File f : files) {
            System.out.println("f.getName() : " + f.getName());
        }
    }

}
