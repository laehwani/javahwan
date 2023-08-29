package project2.Class;

public class C07method {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        MyClass07 o2 = new MyClass07();

        o1.name = "java";
        o2.name = "spring";

        o1.printname();
        o2.mymethod();
    }
}

class MyClass07 {
    String name;

    void printname() {
        System.out.println("실행됨");
        System.out.println("name : " + name);

    }
    void mymethod() {
        System.out.println("호로로롤");
        System.out.println("name : " + name);

    }
}