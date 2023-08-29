package project2.Class.lecture;

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

}