package project2.Class.lecture;

public class C09polymorphism {
    public static void main(String[] args) {
        MySub09 o1 = new MySub09();
        MyClass09 o2 = o1;
        MyClass09 o3 = o1;

        MyClass09 o4 = new MySub09();

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o4));

        o1.method01(); // 변수의 타입과 관계업이 실제 인스턴스 메서드가 실행
        o2.method01(); // 실제 인스턴스의 메서드 실행
        o4.method01();
    }
}

class MyClass09 {
    void method01() {
        System.out.println("부모 메서드");
    }
}

class MySub09 extends MyClass09 {
    @Override
    void method01() {
        super.method01();
        System.out.println("자식 메서드");
    }
}