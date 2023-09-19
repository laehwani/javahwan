package project2.Class.ch18io.book.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P07 {

    public static void main(String[] args) throws Exception {
        String filePath = "project2/Class/ch18io/book/exercise/P07.java";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData = null;
        while (true) {
            try {
                rowData = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (rowData == null) {
                break;
            }
            rowNumber++;
            System.out.printf("%d: %s%n", rowNumber, rowData);
        }
        br.close();
        fr.close();

    }
}