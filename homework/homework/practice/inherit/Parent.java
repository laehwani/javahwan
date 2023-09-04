package homework.homework.practice.inherit;

public class Parent {
    int age;

}

class Child extends Parent {
    // 자식의 멤버는 현재 0개 이지만, 부모에게 상속받은 멤버가 1개 있다. int age
    void play() {
        System.out.println("널자~");
    }
    // 자식의 멤버 추가는 부모에게 아무런 영향이 없다.
}
