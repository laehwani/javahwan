package project2.Class.ch18io.lecture;

import java.io.File;

public class C30directory {

    public static void main(String[] args) {

        File file = new File("C:/Temp/test");

        System.out.println("file.exists() : " + file.exists());

        if (!file.exists()) {
            file.mkdir();
            // .mkdir : 디렉토리 만들기 명령어
        }
    }

}
