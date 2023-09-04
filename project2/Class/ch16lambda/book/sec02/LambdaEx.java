package project2.Class.ch16lambda.book.sec02;

public class LambdaEx {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(()->{
            System.out.println("출근을 합니다");
            System.out.println("프로그래밍을 합니다");
        });
        // 실행문이 두 개 이상인 경우 중괄호 필수

       person.action(()-> System.out.println("퇴근합니다"));
       // 실행문이 한 개일 경우 중괄호 생략 가능
    }
}
