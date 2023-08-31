package homework.homework;

class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
public class instanceofTest {
    public static void main(String[] args) {
        Animal ani01 = new Dog();
        Animal ani02 = new Cat();

        System.out.println( ani01 instanceof Animal);
        // true
        System.out.println( ani01 instanceof Dog);
        // true
        System.out.println( ani01 instanceof Cat);
        // false
        System.out.println( ani02 instanceof Animal);
        // true
        System.out.println( ani02 instanceof Dog);
        // false
        System.out.println( ani02 instanceof Cat);
        // true


    }
}
