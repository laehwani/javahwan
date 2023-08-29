package project2.Class.lecture;

import com.sun.source.tree.UsesTree;

public class C03extends {
    public static void main(String[] args) {
        MySubClass03 o1 = new MySubClass03();
        o1.printname();
    }
}

class MyClass03 {
    private String name;

    void printname() {
        System.out.println("name = " + name);
    }
}

class MySubClass03 extends MyClass03 {
//    void setName(String name) {
//        // private field 는 자식클래스에서 사용할 수가 없다.
//        this.name = name;
}
