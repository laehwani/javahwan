package project2.Class.ch13generic.book.exercise.p02;

import java.awt.*;

public class ContainerEx {
    public static void main(String[] args) {
        Container<String> con = new Container<>();
        con.set("홍길동");
        String str = con.get();
        System.out.println(str);

        Container<Integer> con2 = new Container<>();
        con2.set(30);
        Integer str2 = con2.get();
        System.out.println(str2);
    }
}

class Container<T> {
    private T content;

    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }
}
