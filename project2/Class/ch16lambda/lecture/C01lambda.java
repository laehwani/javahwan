package project2.Class.ch16lambda.lecture;

public class C01lambda {
    public static void main(String[] args) {
        MyInterface01 o1 = (x, y)->{
                System.out.println(x + y);
        };
        // lambda 식
        MyInterface01 o2 = new MyInterface01() {
            @Override
            public void method01(int x, int y) {
                System.out.println(x + y);
            }
        };
    }
}

    // lambda식은 추상 메서드가 하나인 인터페이스의 객체를 만들 때 사용가능하다
interface MyInterface01 {
    void method01(int x, int y);
}
