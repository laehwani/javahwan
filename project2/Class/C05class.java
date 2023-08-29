package project2.Class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();
        System.out.println("01의 참조값" + System.identityHashCode(o1));

        o1.age = 30;
//        o1.model = "java";  model 은 static 이 붙은 클래스필드이기에 이 표현은 바람직하지 않다.
        MyClass05.model = "spring";
        System.out.println("o1.age = "+ o1.age);
        System.out.println("o2.age = "+ o2.age);
        System.out.println("o1.model = "+ o1.model);
        System.out.println("o2.model = "+ o2.model);

    }
}
class MyClass05 {
    int age;
    // instance field
    static String model;
    // static 이 붙으면 인스턴스가 아닌 클래스에 속한 필드가 된다.

}
