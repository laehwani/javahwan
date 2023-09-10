package homework.homework.practice.innerClass.exam1;

public class C02innerClass {

    class InstanceInner{}
    static class StaticInner{}

    InstanceInner iv = new InstanceInner(); // 인스턴스멤버끼리는 직접 접근 가능
    StaticInner cv = new StaticInner(); // static 멤버끼리는 직접 접근 가능
    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner(); // 에러!
        // static 메서드에서는 인스턴스멤버에 직접 접근 불가
        StaticInner obj2 = new StaticInner();
    }

    void instanceMethod() {
        // 인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // 지역클래스는 당연히 외부에서 접근 불가
    }

    void myMethod() {
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
    public static void main(String[] args) {

    }
}
