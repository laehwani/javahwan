package project2.Class.Ch17stream.book.exam.p08;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex {
    public static void main(String[] args) {
        var list = List.of(
                new Member("홍길동","개발자"),
                new Member("김나리","디자이너"),
                new Member("신용권","개발자"),
                new Member("김다솜","디자이너")
        );
        // 직업으로 기준으로 나누는걸 그룹핑으로 표현하기
        Map<String, List<Member>> grouping = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));
        System.out.println("[개발자]");
        grouping.get("개발자")
                .forEach(System.out::println);
        System.out.println();
        System.out.println("[디자이너]");
        grouping.get("디자이너")
                .forEach(System.out::println);
        System.out.println();

        // 직업으로 기준으로 나누는걸 콜렉터스로 표현하기
//        System.out.println("[개발자]");
//        Map<String, String> job = list.stream()
//                .filter(s-> s.getJob().equals("개발자"))
//                .collect(Collectors.toMap(
//                        Member::getName,
//                        Member::getJob
//                ));
//        System.out.println(job);
//        System.out.println();
//        System.out.println("[디자이너]");
//        Map<String, String> job1 = list.stream()
//                .filter(s -> s.getJob().equals("디자이너"))
//                .collect(Collectors.toMap(
//                        Member::getName,
//                        Member::getJob
//                ));
//        System.out.println(job1);
    }
}
