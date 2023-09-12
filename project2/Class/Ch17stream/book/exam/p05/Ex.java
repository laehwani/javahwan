package project2.Class.Ch17stream.book.exam.p05;

import java.util.List;

public class Ex {
    public static void main(String[] args) {
        var list = List.of(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports");

        System.out.println("일반 for문 사용");
        for (String item : list) {
            if (item.toLowerCase().contains("java")) {
                System.out.println(item);
            }
        }

        System.out.println("stream 사용");
        list.stream()
                .filter(s-> s.toLowerCase().contains("java"))
                .forEach(System.out::println);

        System.out.println("indexOf 사용");
        list.stream()
                .filter(s-> s.toUpperCase().indexOf("JAVA") != -1)
                .forEach(System.out::println);

    }
}
