package homework.homework.practice.Interface.Player.test2;

class A {
    public void method(B b) {
        b.method();
    }
}
class B {
    public void method() {
        System.out.println("B클래스의 메서드");}
}
class C {
    public void method() {
        System.out.println("C클래스의 메서드");}
}
public class C01Interface {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        // A 가 B를 사용하였다.

//        a.method(new C());
        // C를 사용하기 위해선 A클래스 또한 바꿔줘야만 한다. 만약 이렇게 계속 늘어간다면 어떻겠는가
        // 이 귀찮음을 해결하기 위한 방법으로 나온게 interface 이다.

    }
}
