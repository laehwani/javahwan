package project2.Class.lecture;

public class C05override {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        o1.method01();
        MySubClass05 o2 = new MySubClass05();
        o2.method01();
        o2.method02();
    }
}

class MyClass05 {
    public void method01() {
        System.out.println("어떤 기능");
    }
}

class MySubClass05 extends MyClass05 {
    public void method01() {
        System.out.println("변경된 기능");
    }
    // 부모에게 물려받은 특정 메서드를 변형 할수 있다.

    public void method02() {
        System.out.println("추가된 기능");
    }
}
