package project2.Class.ch12api.lecture;

import java.util.Objects;

public class C07equals {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07("김래환");
        MyClass07 o2 = new MyClass07("김다솜");
        MyClass07 o3 = new MyClass07("김다솜");

        System.out.println(o1 == o2);   // false
        System.out.println(o2 == o3);   // false
        System.out.println(o2.equals(o3));

        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());

    }
}

class MyClass07 {
    private String name;

    public MyClass07(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        MyClass07 o1 = (MyClass07) o;
        return this.name.equals(o1.name);
    }
}

