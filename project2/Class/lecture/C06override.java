package project2.Class.lecture;

public class C06override {
    public static void main(String[] args) {

        MyClass06 o1 = new MyClass06();
        o1.method10();
        MySub06 o2 = new MySub06();
        o2.method10();
        MyClass06 o3 = new MySub06();
        o1.method10();
        o2.method10();
    }
}

class MySub06 extends MyClass06 {
    public void method10() {
        System.out.println("오버라이드 된 메서드");
    }

}
class MyClass06 {
    public void method10() {
        System.out.println("부모 클래스의 메서드");
    }
}
