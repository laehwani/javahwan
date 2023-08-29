package project2.Class.book.sec07.exam02;

import java.awt.*;

public class ChildEx {
    public static void main(String[] args) {

        Child child = new Child();

        Parent parent = child;

        parent.method01();
        parent.method02();
    }
}
