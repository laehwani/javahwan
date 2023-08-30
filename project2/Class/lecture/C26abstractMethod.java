package project2.Class.lecture;

    // 추상클래스에 대해서...
public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath();

        Animal26 d2 = new Dog26();
        d2.breath();

        Animal26 a2 = new Fish26();
        a2.breath();

    }
}

// 추상메서드를 가진 클래스는 무조건 추상클래스가 되어야 한다.
abstract class Animal26 {
    abstract public void breath();
    // 추상 메서드 : 몸통이 없는 메서드
}

class Dog26 extends Animal26 {
    // 하위 클래스의 추상 메서드는 꼭 재정의(오버라이딩) 해야한다.

    @Override
    public void breath() {
        System.out.println("폐로 숨을 쉽니다.");
    }
}

class Fish26 extends Animal26 {
    // 하위 클래스의 추상 메서드는 꼭 재정의(오버라이딩) 해야한다.
    @Override
    public void breath() {
        System.out.println("아가미로 숨을 쉽니다.");
    }
}