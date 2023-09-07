package project2.Class.ch13generic.book.exercise.p03;

import java.awt.*;

public class ContainerEx {
    public static void main(String[] args) {
        Container<String, String> con1 = new Container();
        con1.setValue("홍길동", "도적");
        String name1 = con1.getKey();
        String job = con1. getValue();
        System.out.println(name1+"은 "+job+"입니다!!!");

        Container<String, Integer> con2 = new Container();
        con2.setKey("길동아!!", 30);
        String name2 = con2.getKey();
        int age = con2.getValue();
        System.out.println(name1+"의 나이는 "+job+"입니다!!!");

    }
}
