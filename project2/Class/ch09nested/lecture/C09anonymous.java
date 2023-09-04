package project2.Class.ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyClass09 mc = new MySub091();
        mc.method01();

        // anonymous class ( 익명 클래스 )
        MyClass09 mc2 = new MyClass09(){
            // 자식 클래스 몸통
            // 이제 여기에 필드, 메서드 작성

            @Override
            void method01() {
                System.out.println("C09anonymous.method01");
            }
        };

    }
}

class MyClass09 {
    void method01() {
        System.out.println("MyClass09.method01");
    }
}

class MySub091 extends MyClass09 {
    @Override
    void method01() {
        System.out.println("MySub091.method01");
    }
}