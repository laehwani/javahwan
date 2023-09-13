package project2.Class.Ch17stream.book.sec12.exam01;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEX {
    public static void main(String[] args) {
        var list = List.of(
                new Student("홍길동","남", 92),
                new Student("김수영","여", 87),
                new Student("김자바","남", 74),
                new Student("오해영","여", 90),
                new Student("래화니","남", 85)
        );
        // 남학생만 묶어 List 생성
        List<Student> maleList = list.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();
        maleList.stream()
                .forEach(s-> System.out.println(s.getName()));
        System.out.println();

        // 학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getScore)
                );
        System.out.println(map);
        System.out.println();

        // 남성과 여성으로 구분하시오
        System.out.println("[남자]");
        Map<String, List<Student>> str1 = list.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        List<Student> male1 = str1.get("남");
        male1.stream()
                .forEach(s-> System.out.println(s.getName()));

        System.out.println("[여자]");
        List<Student> female = str1.get("여");
        female.stream()
                .forEach(s-> System.out.println(s.getName()));

        System.out.println();



//         남자와 여자의 평균점수를 구하시오
        Map<String, Double> map1 = list.stream()
                .collect(Collectors.groupingBy(
                        Student::getSex,
                        Collectors.averagingDouble(Student::getScore)
                ));
        System.out.println(map1);
    }
}
    // 결론 인텔리j가 신이다