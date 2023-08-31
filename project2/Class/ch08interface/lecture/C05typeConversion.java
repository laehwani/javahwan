package project2.Class.ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        Number a = i;
        Object b = i;
        Serializable c = i;
        Comparable<Integer> d = i;
        Constable e = i;
        ConstantDesc f = i;

    }
}
