package project2.Class.ch09nested.lecture;

public class C10anonymous {
    public static void main(String[] args) {
//        MyClass10 o1 = new MyClass10();

        MyClass10 o2 = new MySub101();
        MyClass10 o3 = new MyClass10() {

        };
    }
}

abstract class MyClass10 {

}

class MySub101 extends MyClass10 {

}

