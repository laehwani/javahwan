package project2.Class.ch08interface.lecture;

import project2.Class.ch08interface.book.sec08.Searchable;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C04string {
    public static void main(String[] args) {
        String a = "java";

        Object o = a;
        Serializable s = a;
        CharSequence c = a;
        Comparable<String> cp = a;
        Constable co = a;
        ConstantDesc cd = a;

    }
}
