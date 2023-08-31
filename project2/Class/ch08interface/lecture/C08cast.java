package project2.Class.ch08interface.lecture;

public class C08cast {
    public static void main(String[] args) {

    Myinterface08 i1 = new MyClass081();
    i1.method1();

//    i1.othermethod();  실행이 안된다.

    MyClass081 o1 = (MyClass081) i1;
    o1.othermethod();
    }
}

interface Myinterface08 {
    void method1();
}

class MyClass081 implements Myinterface08 {
    @Override
    public void method1() {
        System.out.println("재정의한 메서드!!!");
    }

    public void othermethod() {
        System.out.println("또다른 메서드!!");
    }
}

