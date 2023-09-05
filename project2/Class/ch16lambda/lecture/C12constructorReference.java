package project2.Class.ch16lambda.lecture;

import java.awt.dnd.DragGestureEvent;
import java.util.stream.IntStream;

public class C12constructorReference {
    public static void main(String[] args) {
        System.out.println("for문 사용");
        for (int i = 1; i < 10; i++) {
            Student a = new Student(i);
            System.out.println(a);
        }

        System.out.println("stream 사용");
        IntStream.range(1, 10)
                .mapToObj(Student::new)
                .forEach(System.out::println);
    }
}

class Student {
    private int number;

    Student(int number) {
        this.number = number;
    }
}
