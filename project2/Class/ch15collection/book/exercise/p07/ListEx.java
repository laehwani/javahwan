package project2.Class.ch15collection.book.exercise.p07;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for(Board board : list){
            System.out.println(board.getTitle()+ "-"+ board.getContent());
        }

        boolean a1 = list.contains(new Board("제목1", "내용1"));
        System.out.println("contains = "+ a1);
        // 왜 false 가 나올까? 다음장에 해석..
    }
}
