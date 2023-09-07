package project2.Class.ch13generic.lecture;

import project2.Class.book.exercise.p12.A;

public class C07wildcard {

    public void someMethod01(MyClass07<? extends Animal> p) {
        Animal item = p.getItem();
    }

    public void someMethod02(MyClass07<? super Animal> p) {
        p.setItem(new Animal());
//        p.setItem(new Dog());     // set 가능
//        p.setItem(new Cat());     // set 가능
    }

    public void otherMethod() {
        someMethod01(new MyClass07<Dog>());
        someMethod01(new MyClass07<Cat>());

        someMethod02(new MyClass07<Object>());
        someMethod02(new MyClass07<Animal>());
    }
    public static void main(String[] args) {

    }
}

class MyClass07<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
