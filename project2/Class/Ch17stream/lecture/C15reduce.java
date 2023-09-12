package project2.Class.Ch17stream.lecture;

import java.util.List;

public class C15reduce {
    public static void main(String[] args) {

        // reduce() : 줄이다

        var list = List.of(5,1,3,9,7,4);

        Integer reduce = list.stream()
                .reduce(0, (r, e) -> 0);
        System.out.println("reduce : "+ reduce);

        System.out.println("모든 값 더하기");
        Integer reduce1 = list.stream()
                .reduce(0, (r, e) -> r + e);
        System.out.println("reduce : "+ reduce1);

        System.out.println("최대값 구하기");
        Integer reduce2 = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("최대값은 : "+ reduce2);

        System.out.println("최소값 구하기");
        Integer reduce3 = list.stream().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("최소값은 : "+ reduce3);

        System.out.println("문자열 구하기");
        var list2 = List.of("ja","va","is","g","ood");
        System.out.println("for문으로 문자열 연결");
        String o1 = "";
        for (String e : list2) {
            o1 += e;
        }
        System.out.println("o1 = "+ o1);

        System.out.println("stream으로 문자열 연결");
        String reduce4 = list2.stream()
                .reduce("", String::concat);
        System.out.println("reduce4 : "+ reduce4);




    }
}
