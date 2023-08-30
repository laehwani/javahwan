package project2.Class.lecture;

    // instanceof 예시 두번째
public class C18cast {
    public static void main(String[] args) {
        Animal18 ani1 = new Dog18();
        Animal18 ani2 = new Cat18();

        if(ani1 instanceof Dog18 d1){
            d1.bark();
        }
        if(ani2 instanceof Dog18 d2){
            d2.bark();
            // 에러난다.
            // ani2 는 고양이기 때문에 개로 형변환이 될수가 없다.
        }
        if(ani2 instanceof Cat18 c1){
            c1.meow();
        }
        if(ani1 instanceof Cat18 c2){
            c2.meow();
            // 에러난다
            // ani1 은 개이기 때문에 고양이로 형변환이 될수가 없다.
        }

    }
}
class Animal18{}
class Dog18 extends Animal18{
    public void bark() {
        System.out.println("멍멍!!!");
    }

}
class Cat18 extends Animal18{
    public void meow() {
        System.out.println("야옹!!!");
    }
}
