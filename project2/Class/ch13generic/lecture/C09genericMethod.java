package project2.Class.ch13generic.lecture;

public class C09genericMethod {
    public static void main(String[] args) {
        MyClass09 o1 = new MyClass09();
        o1.<Object>method(new Object());
        o1.<String>method(new String());

        o1.method(new Object());

        String s = o1.<String>method();
        Object o = o1.<Object>method();

    }
}

class MyClass09 {
    public <T>void method(T p) {
        // 제네릭메서드 표현법
    }

    public <T> T method() {
        return null;
    }
}
