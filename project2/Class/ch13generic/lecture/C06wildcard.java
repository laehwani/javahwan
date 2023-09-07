package project2.Class.ch13generic.lecture;

import project2.Class.book.exercise.p12.A;

public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1;  // ?
//        o2.set(new Animal());
        MyClass06<? extends Animal> o3 = o1;
        MyClass06<? extends Animal> o6 = new MyClass06<>();
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>();
//        MyClass06<? extends Animal> o8 = new MyClass06<Object>(); // false
        // 와일드카드 extends 는 상속대상으로부터 하위 타입만 받을 수 있다.

        MyClass06<? super Animal> o9 = new MyClass06<Animal>();
        MyClass06<? super Animal> o10 = new MyClass06<Object>();
//        MyClass06<? super Animal> o11 = new MyClass06<Dog>();     // false
        // 와일드카드 super 는 상속대상으로부터 상위 타입만 받을 수 있다.

        o9.set(new Dog());      //
        o10.set(new Dog());
        o9.set(new Cat());
        o9.set(new Animal());


        Animal ani1 = o3.get(); // 안전
//        o3.set(new Dog());    // 안전하지않다.
//        ani1.animalMethod();    // 안전하게 사용된다.
    }
}

class Animal{
    public void animalMethod() {

    }
}
class Dog extends Animal{}
class Cat extends Animal{}
class MyClass06<T> {
    public void set(T t){}
    public T get(){
        return null;
    }
}
