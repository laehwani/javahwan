package project2.Class.Ch17stream.book.exam.p06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class EX {

    // map 중간연산을 사용해서 Member 의 나이들을 출력해보시오
    private String name;
    private int age;

    public EX(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Member {
    public static void main(String[] args) {
        var list = List.of(
                new EX("화니",10),
                new EX("소미",20),
                new EX("현이",30)
        );

//        System.out.println("나이들만 출력");
//        list.stream()
//                .map(m-> m.getAge())
//                .forEach(System.out::println);
//                .forEach(s-> System.out.println(s.getAge()));

        System.out.println("나이들의 합 reduce로 구해서 출력");
        // stream, map, reduce
        Integer reduce = list.stream()
                .map(m -> m.getAge())
                .reduce(0, Integer::sum);
        System.out.println("나이의 합은 : "+ reduce);

        System.out.println("가장 많은 나이 reduce로 구해서 출력");
        Integer maxAge = list.stream().map(m1 -> m1.getAge())
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("가장 많은 나이는 : "+ maxAge);

        System.out.println("가장 적은 나이 reduce로 구해서 출력");
        Integer minAge = list.stream().map(m1 -> m1.getAge())
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("가장 적은 나이는 : "+ minAge);

        System.out.println("나이의 평균을 구하시오");
        double avg = list.stream()
                .mapToInt(EX::getAge)
                        .average()
                                .getAsDouble();
//                .reduce(Integer::sum);
        System.out.println("나이의 평균은 : "+avg);

    }
}
