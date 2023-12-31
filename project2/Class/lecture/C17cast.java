package project2.Class.lecture;

    // instanceof 예시
public class C17cast {
    public static void main(String[] args) {
        Animal17 ani1 = new Dog17();
        Animal17 ani2 = new Cat17();
//        ani1.bark();  <- 에러난다

        if (ani1 instanceof Dog17){
            Dog17 d1 = (Dog17) ani1;
            d1.bark();
        }else{
            System.out.println("Dog17로 형변환 안됨");
        }
        //위에 코드는 에러
        if(ani1 instanceof Cat17){
            Cat17 c1 = (Cat17)ani2;
            c1.meow();
        }else{
            System.out.println("Cat로 형변환 안됨");
        }
        if(ani2 instanceof Dog17){
            Dog17 d2 = (Dog17)ani2;
            d2.bark();
        }else{
            System.out.println("Dog로 형변환 안됨");
        }
        if(ani2 instanceof Cat17){
            Cat17 c2 = (Cat17)ani2;
            c2.meow();
        }else{
            System.out.println("Cat17로 형변환 안됨");
        }
        // 위에 코드는 에러

    }
}
class Animal17{}
class Dog17 extends Animal17{
    public void bark() {
        System.out.println("멍멍멍멍");
    }
}
class Cat17 extends Animal17{
    public void meow() {
        System.out.println("야옹야옹");
    }
}