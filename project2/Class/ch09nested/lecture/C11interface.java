package project2.Class.ch09nested.lecture;

public class C11interface {
    public static void main(String[] args) {
//        MyInterface11 o1 = new MyInterface11();
        MyInterface11 o2 = new MyClass11();
        MyInterface11 o3 = new MyInterface11(){
            @Override
            public void method01() {
                System.out.println("메서드 실행");
            }
        };
        o3.method01();

    }
}

interface MyInterface11 {
    void method01();
}

class MyClass11 implements MyInterface11 {
    @Override
    public void method01() {
        System.out.println("MyClass11.method01");
    }
}
