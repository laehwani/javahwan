package project2.Class.ch16lambda.lecture;

    // 람다( lambda ) 식에 대해...
public class C02lambda {
    public static void main(String[] args) {
        MyInterface02 o1 = new MyInterface02() {
            @Override
            public void method() {
                System.out.println("C02lambda.method");
            }
        };
        o1.method();
        // 일반적인 호출문

        MyInterface02 o2 = () -> {
            System.out.println("C02lambda.main");
        };
        o2.method();
        // lambda 식
        // ( 파라미터 목록 )-> { 메서드 몸통 }

        MyInterface02 o3 = () -> System.out.println("C02lambda.main");
        // 람다식에서 메서드 몸통의 코드가 한 줄이면 중괄호 생략 가능
        o3.method();
    }
}

@FunctionalInterface
interface MyInterface02 {
    // 파라미터 없는 메서드
    // 리턴값도 없음
    void method();
}
