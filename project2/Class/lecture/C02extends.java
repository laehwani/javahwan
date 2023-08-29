package project2.Class.lecture;

public class C02extends {
    public static void main(String[] args) {
        MysubClass02 o1 = new MysubClass02();
        o1.name = "spring";
        o1.method3();

    }
}
// 위 코드에 문법오류가 없도록 MyClass02 를 작성
class MyClass02 {
    String name;

    void method3() {
        System.out.println("name : "+ name);
    }
}
class MysubClass02 extends MyClass02{

}
// MyClass02 : 상위 클래스, 부모 클래스, super class
// MysubClass02 : 하위 클래스, 자식 클래스, sub class