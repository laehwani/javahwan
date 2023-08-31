package project2.Class.lecture;

public class MyClass30 {
    private void privateMethod() {
        System.out.println("MyClass30.privateMethod");
    }

    public void publicmethod() {
        System.out.println("MyClass30.publicmethod");
        // private 멤버( 필드, 생성자, 메서드 ) 가 여기 접근 가능

        privateMethod();
    }

    void pakagePrivateMethod() {
        System.out.println("MyClass30.pakagePrivateMethod");
        // private 멤버 접근 가능

        privateMethod();
        protectedMethod();
    }

    protected void protectedMethod() {
        System.out.println("MyClass30.protectedMethod");

        privateMethod();
        pakagePrivateMethod();
        publicmethod();
    }
}
