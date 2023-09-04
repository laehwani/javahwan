package project2.Class.ch16lambda.lecture;

public class C07methodReference {
    public static void main(String[] args) {
        MyInterface07 o1 = (x, y) -> MyClass07.method2(x,y);
        MyInterface07 o2 = MyClass07::method2;
    }
}

class MyClass07 {
    static void method2(int x, int y) {
    }
}

interface MyInterface07 {
    void method(int x, int y);
}
