package project2.Class.ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C16unchecked {

    public static void main(String[] args) {

        try {
            var input = new FileInputStream("file");
            // checked exception 은 예최처리코드 꼭 작성

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
