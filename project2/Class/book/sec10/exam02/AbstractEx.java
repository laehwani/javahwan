package project2.Class.book.sec10.exam02;

public class AbstractEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalsound(new Dog());
        animalsound(new Cat());
        // 매개변수의 다형성
    }
    private static void animalsound(Animal animal) {
        animal.sound();
    }
}
