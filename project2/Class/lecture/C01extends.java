package project2.Class.lecture;

public class C01extends {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.age = 33;
        o1.method1();

        MysubClass01 o2 = new MysubClass01();
        o2.age = 45;
        o2.method1();
    }
}
class MysubClass01 extends MyClass01 {
}
// Myclass01 의 멤버를 extends 함.
class MyClass01 {
    int age;    void method1() {
        System.out.println("MyClass01.method1");
    }
}
