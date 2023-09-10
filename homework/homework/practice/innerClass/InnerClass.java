package homework.homework.practice.innerClass;

public class InnerClass {
}

class A { }
class B { }
    // B 클래스가 A 클래스에 접근하기 위해서는 A 의 객체를 생성해서 써야만 한다.

class C {
    class D{
        // 내부 클래스가 되면 객체 생성 없이도 C 의 멤버에 접근이 가능하다.
        // 사실상 이 코드에서 클래스 D 는 클래스 C 의 멤버라고 할 수 있다.
    }
}