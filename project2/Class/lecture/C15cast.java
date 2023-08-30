package project2.Class.lecture;

    // 강제 형변환의 문제.
    // 강제 형변환은 가능하지만 같은 상속관계로 이어져있어야만 한다.
public class C15cast {
    public static void main(String[] args) {
        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15();

        Dog15 d1 = (Dog15) ani1;  // 강제 형변환 된다.
        Cat15 c1 = (Cat15) ani2;  // 강제 형변환 된다.

        Cat15 c2 = (Cat15) ani1;  // 문법오류는 아니지만, 안 된다!
        // Cat15 는 Dog15 와 Animal15 를 같이 상속받으며 공유하지만 Dog15가 아니다.
        Dog15 d2 = (Dog15) ani2;  // 문법오류는 아니지만, 안 된다!

        Animal15 ani3 = new Animal15();
        Dog15 d3 = (Dog15) ani3;  // 문법오류는 아니지만, 안 된다!

        System.out.println("프로그램 실행 계속됨..");
    }
}

class Animal15 {

}

class Dog15 extends Animal15 {

}

class Cat15 extends Animal15 {

}