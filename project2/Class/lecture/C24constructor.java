package project2.Class.lecture;

    // 파라미터값이 있는 생성자를 생성하였을때.
public class C24constructor {
    public static void main(String[] args) {

    }
}

class MyClass24 {
    int age;

    MyClass24(int age) {
        this.age = age;
    }
    // 파라미터가(매개변수) 있는 생성자를 생성하면
    // 파라미터가(매개변수) 없는 생성자(기본 생성자)가 자동으로 삽입되지 않는다.

}

class MySub24 extends MyClass24 {

    // 상위 클래스에 파라미터값이 있는 생성자를 수동생상하였으므로,
    // 명시적으로 상위 클래스의 생성자 호출 코드를 작성해야만 한다.
    MySub24() {
        super(30);
    }
}

