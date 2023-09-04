package homework.homework.practice.inherit.C02;

class Parent01 {
    int x;
    int y;
}
    // Parent 와 Child 는 서로 다른 클래스로써 서로간에 관계가 없다.
class Child {
    int x;
    int y;
    int z;
}

class Child01 extends Parent01 {
    int z;
}
// Child01 은 부모와 자식관계이기 때문에 관계가 있다.