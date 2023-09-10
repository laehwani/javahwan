package homework.homework.practice.Interface.Player.test2;

class A1 {
    public void method1(I1 i1) {
        i1.method();
    }
}

interface I1 {
    public void method();
    // 인터페이스 I1 을 메서드 매개변수로 구현한 애들만 오라는 뜻.
}
class B1 implements I1{
    public void method() {
        System.out.println("B클래스의 메서드");}
}
class C1 implements I1 {
    public void method() {
        System.out.println("C클래스의 메서드");}
}
public class C02interface {
    public static void main(String[] args) {
        A1 a = new A1();
        // A1 은 인터페이스 I1 을 매개변수로 구현하였기 때문에 관계가 맺어졌다.
        a.method1(new C1());
        a.method1(new B1());

        I1 i1 = new B1();
        I1 i2 = new C1();
        i1.method();
        i2.method();
        // 방법 2
    }
}
