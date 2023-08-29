package project2.Class.lecture;

public class CO7override {
    public static void main(String[] args) {

        MySub07 o1 = new MySub07();
        o1.method01();
    }
}

class MyClass07 {
    void method01() {
        System.out.println("부모 클래스 메서드 기능");
    }
}

class MySub07 extends MyClass07 {
    @Override
    void method01() {
        super.method01();
        // super 는 부모 클래스의 멤버 호출 명령문이다.
        System.out.println("자식 클래스의 재정의한 메서드");
    }
}