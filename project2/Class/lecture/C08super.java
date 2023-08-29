package project2.Class.lecture;

public class C08super {

    public static void main(String[] args) {
        MySub08 o1 = new MySub08();
        o1.method1();

    }
}
class MyClass08 {
    void method1() {
        System.out.println("부모의 메서드!");
    }
}

class MySub08 extends MyClass08 {
    @Override
    void method1() {
        System.out.println("자식의 메서드!!!");
        super.method1();
        // super 가 하는 일 : 부모의 멤버를 그대로 가져올때 사용하는 키워드
    }
}