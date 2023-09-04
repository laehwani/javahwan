package project2.Class.ch16lambda.lecture;

public class C08methodReference {
    public static void main(String[] args) {
        MyClass08 o2 = new MyClass08();
        MyInterface08 o1 = (x,y) -> o2.method2(x,y);
        MyInterface08 o3 = o2::method2;
    }
}

class MyClass08 {
    void method2(int x, int y) {
    }
}
interface MyInterface08 {
    void method(int x, int y);
}
