package project2.Class.lecture;

    // 생성자(constructor) 에 대해
public class C21constructor {
    public static void main(String[] args) {
        MyClass21 o1 = new MyClass21(40);
        o1.printage();
        MyClass21 o2 = new MyClass21(11);
        o2.printage();

    }
}

class MyClass21 {
    private int age;

    MyClass21(int age) {
        this.age = age;
    }
    // 생성자 : 인스턴스 코드를 만들 때 처음 해야 하는 일(코드) 작성
    // 주로 필드 초기화 코드 작성

    public void printage() {
        System.out.println("age : "+ age);
    }
}
