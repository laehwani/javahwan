package project2.Class.lecture;

    // 추상화 (abstract) 에 대해..
public class C25abstract {
    public static void main(String[] args) {
        Dog25 d1 = new Dog25();
        Cat25 c1 = new Cat25();

        Animal25 a1 = d1;
        Animal25 a2 = c1;

//        Animal25 a3 = new Animal25();
        // 추상클래스화(abstract) 로 인해 위에 a3 은 에러.
    }
}

// 추상클래스(abstract class)로 인스턴스 생성 불가를 명한다.
abstract class Animal25 {

}

class Dog25 extends Animal25 {

}

class Cat25 extends Animal25 {

}