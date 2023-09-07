package project2.Class.ch15collection.book.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Board> list = new ArrayList<>();

        // 객체를 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // 저장된 전체 객체 수 확인
        int size = list.size();
        System.out.println("총 객체 수 : "+ size);
        System.out.println();

        // 특정 인덱스의 객체 가져오기
        Board b = list.get(2);
        System.out.println(b.getSubject()+ "\t"+ b.getContent()+ "\t"
                + b.getWriter());
        System.out.println();

        // 모든 객체를 하나씩 가져오기
        for (int i = 0; i < list.size(); i++) {
            Board b1 = list.get(i);
            System.out.println(b1.getSubject()+ "\t"+ b1.getContent()+ "\t"
                    + b1.getWriter());
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            Board b1 = list.get(i);
            System.out.println(b1.getSubject()+ "\t"+ b1.getContent()+ "\t"
                    + b1.getWriter());
        }
        System.out.println();

        // foreach 문으로 표현해보기
        System.out.println("foreach 사용1");
        list.forEach(e-> System.out.println(e.getSubject()+ "\t"+ e.getContent()+ "\t"
                + e.getWriter()));

        System.out.println("foreach 사용2");
        list.forEach(System.out::println);

    }
}
