package project2.Class.lecture;

    // 상속안에서 생성자와 super() 에 대해
public class C22extends {
    public static void main(String[] args) {
        MySub22 o1 = new MySub22();

    }
}

class MyClass22 {
    MyClass22() {
        // 초기화하는 코드들 작성..
        System.out.println("상위 클래스 초기화코드들");
    }
}

class MySub22 extends MyClass22 {
    MySub22() {
        // 상위 클래스 생성자 호출(초기화하는 코드) 을 무조건 해줘야 한다.
        super();
        // 꼭 있어야하지만 수동으로 안쓰면 자바에서 자동으로 삽입.
        // 이 super() 는 가장 위에 있어야 한다.
        System.out.println("하위 클래스 초기화코드");
    }
}