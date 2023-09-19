package project2.Class.ch14thread.book.sec02.exam02;

import java.util.ArrayList;
import java.util.List;
import project2.Class.ch15collection.book.sec02.Board;

public class VectorEx {

    public static void main(String[] args) throws InterruptedException {

//        List<Board> list = new Vector<>();

        List<Board> list = new ArrayList<>();
        Thread threadA = new Thread() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };
        Thread threadB = new Thread() {
            public void run() {

                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }

            }
        };
        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("총 객체 수 : " + list.size());
        System.out.println();
    }
}
