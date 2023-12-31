package project2.Class.ch15collection.book.exercise.p07;

import project2.Class.book.exercise.p12.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03contains {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add(new String("java"));
        list1.add(new String("string"));

        boolean c1 = list1.contains(new String("java"));
        System.out.println("c1 = "+ c1);

        List<MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥민"));
        list2.add(new MyClass03("강인"));

        boolean c2 = list2.contains((new MyClass03("흥민")));
        System.out.println("c2 = "+  c2);
    }
}

class MyClass03 {
    private String name;

    public MyClass03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass03 myClass03 = (MyClass03) o;

        return Objects.equals(name, myClass03.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
