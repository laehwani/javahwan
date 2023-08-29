package project2.Class;

public class C08static {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();
//        o1.name = "java";
//        o1.printname();
        // MyClass08 의 필드와 메서드는 static 이므로 위에는 잘못된 접근

        MyClass08.name = "spring";
        MyClass08.printname();
        // static member 는 클래스 이름으로 바로 접근하세요.
    }
}

class MyClass08 {
    static String name;

    static void printname() {
        System.out.println("name = "+ name);
    }
}