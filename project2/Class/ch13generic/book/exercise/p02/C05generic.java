package project2.Class.ch13generic.book.exercise.p02;

import java.util.HashMap;

public class C05generic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        MyClass05<String, Integer> o1 = new MyClass05<>();
        MyClass05<Integer, String> o2 = new MyClass05<>();
    }
}

class MyClass05<T,V> {
    private T field1;
    private V field2;

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public V getField2() {
        return field2;
    }

    public void setField2(V field2) {
        this.field2 = field2;
    }
}
