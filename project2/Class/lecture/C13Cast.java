package project2.Class.lecture;

public class C13Cast {
    public static void main(String[] args) {
        Animal13 ani1 = new Dog13();
        Animal13 ani2 = new Cat13();

        ani1.breath();
        ani2.breath();
//        ani1.sound();  안됨 역방향이라서

        // type casting ( 강제 형변환 ) -- 매우 위험하기에 잘 안쓰인다.
        Dog13 d1 = (Dog13) ani1;
        d1.sound();

        Cat13 c1 = (Cat13) ani2;
        c1.hunt();

    }
}

class Animal13 {
    void breath() {
        System.out.println("숨을 셔요");
    }
}

class Dog13 extends Animal13{
    void sound() {
        System.out.println("강아지는 왈왈");
    }
}

class Cat13 extends Dog13{
    void hunt() {
        System.out.println("고양이는 쥐를 잡아");
    }
}