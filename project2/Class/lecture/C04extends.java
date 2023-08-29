package project2.Class.lecture;

public class C04extends {
    public static void main(String[] args) {
        MySubClass04 o1 = new MySubClass04();
        o1.method01();
        o1.method02();

        MySubClass041 o2 = new MySubClass041();
    }
}
class MyClass04 {
    void method01() {
        System.out.println("MyClass04.method01");
    }
}
class MySubClass04 extends MyClass04{
    private int name;
    void method02() {
        System.out.println("name : "+ name);
    }
}
class MySubClass041 extends MyClass04 {
    private int age;
    void method03(){
        System.out.println("age : "+ age);
    }
}
