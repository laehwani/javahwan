package project2.Class.ch16lambda.book.sec05;

public class ReferenceEx {
    public static void main(String[] args) {
        Person person = new Person();

        // 정적 메서드일 경우
        // 람다식
        person.action((x,y)-> Com.staticMethod(x,y));
        person.action(Com::staticMethod);

        // 인스턴스 메서드일 경우
        Com com = new Com();
        // 람다식
        person.action((x, y) -> com.instanceMethod(x,y));
        person.action(com::instanceMethod);
    }
}
